
public class SistemaIGBGE {
	public static void main(String[] args) {
		for(EstadoBrasileiro e: EstadoBrasileiro.values( )) {
			System.out.println(e.getSigla() + " - " + e.getNome());
		}
		
		EstadoBrasileiro eb =  EstadoBrasileiro.PIAUI;
		System.out.println("O estado escolhido foi: " + eb);
	}
}
