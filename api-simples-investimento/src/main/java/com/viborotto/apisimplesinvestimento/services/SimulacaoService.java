package com.viborotto.apisimplesinvestimento.services;

import com.viborotto.apisimplesinvestimento.models.Produto;
import com.viborotto.apisimplesinvestimento.models.Simulacao;
import org.springframework.stereotype.Service;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class SimulacaoService {
	public List<Simulacao> calcular(Produto produto, double valor){
		List<Simulacao> simulacoes = new ArrayList<Simulacao>();
		Locale locale = new Locale("pt", "BR");
		
		for(Month mes : Month.values()) {
			Simulacao simulacao = new Simulacao();
			
			simulacao.setMes(mes.getDisplayName(TextStyle.FULL, locale));
			simulacao.setValor(valor);
			
			valor += valor * produto.getRendimento();
			
			simulacoes.add(simulacao);
		}
		
		return simulacoes;
	}
}
