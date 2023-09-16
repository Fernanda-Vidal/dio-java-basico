package lanchonete.atendimento.cozinha;

public class Cozinheiro {
	Almoxarife almoxarife = new Almoxarife();
	public void cozinhar() {
		System.out.println("COZINHEIRO ESTÁ COZINHANDO O PEDIDO");
		
		almoxarife.trocarGas();;
	}
	
	void solicitaIngrediente() {
		almoxarife.entregaIngredientes("queijo");
	}
	
	private void lavarIngredientes() {
		System.out.println("COZINHEIRO ESTÁ LAVANDO O INGREDIENTE");
	}
	
	public void adicionarBalcao() {
		System.out.println("ADICIONAR AO BALCÃO");
	}
	
	void pedirTrocaGas() {
		System.out.println();
	}
}
