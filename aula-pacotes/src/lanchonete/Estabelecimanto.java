package lanchonete;

import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimanto {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		cozinheiro.cozinhar();
		
		Almoxarife almoxarife = new Almoxarife();
		almoxarife.controlaEntradasSaidas();
	}
}
