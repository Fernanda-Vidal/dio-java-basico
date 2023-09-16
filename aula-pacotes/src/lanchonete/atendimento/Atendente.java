package lanchonete.atendimento;

import lanchonete.atendimento.cozinha.Cozinheiro;

public class Atendente {
	Cozinheiro cozinheiro = new Cozinheiro();
	public void atendimento() {
		System.out.println("O ATENDENTE ESTÁ ATENDENDO");
		
		cozinheiro.adicionarBalcao();

	}
}
