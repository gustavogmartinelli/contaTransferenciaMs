package com.br4dev.ms.conta.transferencia.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br4dev.ms.conta.transferencia.operacao.Resposta;


@RestController
public class CreditoContaController{

	/**
	 * 
	 */
	@RequestMapping("/credito")
	public Resposta credito() {
		Resposta conta  = new Resposta();
		conta.setConteudo("1");
		return conta;
	}

}
