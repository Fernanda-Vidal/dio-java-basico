package lanchonete.atendimento.cozinha;

public class Almoxarife {
	Cozinheiro cozinheiro = new Cozinheiro();
	public void controlaEntradasSaidas() {
		System.out.println("ALMOXARIFADO ESTÁ CONTROLANDO AS ENTRADAS E SAIDAS");
	}
	
	void trocarGas() {
		cozinheiro.pedirTrocaGas();
		System.out.println("ALMOXARIFADO ESTRÁ TROCANDO O GÁS");
	}
	
	void entregaIngredientes(String ingrediente) {
		System.out.println("ENTREGA " + ingrediente + " SOLICITADO");
	}

}
