package com.viborotto.apisimplesinvestimento.controllers;

import com.viborotto.apisimplesinvestimento.models.Aplicacao;
import com.viborotto.apisimplesinvestimento.models.Produto;
import com.viborotto.apisimplesinvestimento.models.Simulacao;
import com.viborotto.apisimplesinvestimento.services.CatalogoService;
import com.viborotto.apisimplesinvestimento.services.SimulacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/simulacao")
public class SimulacaoController {

	@Autowired
	SimulacaoService simulacaoService;
	
	@Autowired
	CatalogoService catalogoService;
	
	@PostMapping
	public List<Simulacao> simular(@RequestBody Aplicacao aplicacao){
		Produto produto = catalogoService.obterProdutoPorId(aplicacao.getIdProduto());
		
		if(produto == null) {
			return null;
		}
		
		return simulacaoService.calcular(produto, aplicacao.getValor());
	}
}
