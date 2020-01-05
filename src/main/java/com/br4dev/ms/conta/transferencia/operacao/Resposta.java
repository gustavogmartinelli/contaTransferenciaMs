package com.br4dev.ms.conta.transferencia.operacao;

public class Resposta {
	
	private String conteudo;
	
	
	public Resposta() {
		
	}
	
	public Resposta(String conteudo) {
		this.setConteudo(conteudo);
	}


	public String getConteudo() {
		return conteudo;
	}


	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

}
