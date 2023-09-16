package vida;

public class SistemaCadastro {
	public static void main(String[] args) {
		Pessoa marcos = new Pessoa("123.123.123-23", "João");
		
		marcos.setEndereco("Rua das Marias");
		
		System.out.println(marcos.getNome() + "- CPF:" + marcos.getCpf() + " - Endereço " + marcos.getEndereco());
	}
}
