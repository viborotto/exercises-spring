package br.com.mastertech.produtoclienteapi.dto;

import br.com.mastertech.produtoclienteapi.model.Produto;

public class AplicacaoDTO {

    private Long id;

    private Produto produto;

    private Double valor;

    private Integer meses;

    public AplicacaoDTO() {
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getMeses() {
        return meses;
    }

    public void setMeses(Integer meses) {
        this.meses = meses;
    }

    public AplicacaoDTO(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
