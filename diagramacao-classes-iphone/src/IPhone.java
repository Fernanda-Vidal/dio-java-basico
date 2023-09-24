import aparelhoTelefonico.AparelhoTelefonico;
import navegadorInternet.NavegadorInterner;
import reprodutorMusical.ReprodutorMusical;

public class IPhone {
    public static void main(String[] args) throws Exception {
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical(true, "In Bloom");

        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica("Morning has Broken");

        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();

        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        NavegadorInterner navegadorInterner = new NavegadorInterner("www.github.com/Fernanda-Vidal");

        navegadorInterner.exibirPagina();
        navegadorInterner.adicionarNovaAba("www.stackoverflow.com.br");
        navegadorInterner.atualizarPagina();
    }
}
