package navegadorInternet;

public class NavegadorInterner {
    private String pagina;
    private int aba;

    public NavegadorInterner(String pagina) {
        this.pagina = pagina;
        this.aba = 1;
    }

    public void exibirPagina() {
        if (this.aba != 1) {
            System.out.println("Exibindo a página " + this.pagina + " na " + aba + "° aba.");
        } else {
            System.out.println("Exibindo a página " + this.pagina);
        }
    }

    public void adicionarNovaAba(String pagina) {
        this.aba = this.aba + 1;
        this.pagina = pagina;
        exibirPagina();
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

}
