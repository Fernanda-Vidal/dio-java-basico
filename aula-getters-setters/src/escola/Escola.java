package escola;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		
		felipe.setNome("Kauã");
//		felipe.nome = "Felipe";
//		felipe.idade = 8;
		felipe.setIdade(9);
		
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos de idade.");
	}
}
