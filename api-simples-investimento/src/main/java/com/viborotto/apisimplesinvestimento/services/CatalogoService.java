package com.viborotto.apisimplesinvestimento.services;

import com.viborotto.apisimplesinvestimento.models.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatalogoService {
	private List<Produto> produtos;
	
	public CatalogoService() {
		Produto produto1 = new Produto();
		produto1.setId(1);
		produto1.setNome("Poupança");
		produto1.setRendimento(0.005);
		
		Produto produto2 = new Produto();
		produto2.setId(2);
		produto2.setNome("CDB");
		produto2.setRendimento(0.007);
		
		Produto produto3 = new Produto();
		produto3.setId(3);
		produto3.setNome("Fundos");
		produto3.setRendimento(0.008);
		
		produtos = new ArrayList<Produto>();
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
	}
	
	public List<Produto> obterProdutos(){
		return produtos;
	}
	
	public Produto obterProdutoPorId(int id) {
		for(Produto produto : produtos) {
			if(produto.getId() == id) {
				return produto;
			}
		}
		
		return null;
	}
}
