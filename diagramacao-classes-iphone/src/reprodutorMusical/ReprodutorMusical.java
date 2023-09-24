package reprodutorMusical;

public class ReprodutorMusical {
    private boolean play = false;
    private boolean pause = true;
    private String musica;

    public ReprodutorMusical(boolean play, String musica) {
        this.play = play;
        this.musica = musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public void setPause(boolean pause) {
        this.pause = pause;
    }

    public void setPlay(boolean play) {
        this.play = play;
    }

    public void tocar() {
        if (this.play == true) {
            System.out.println("A música " + this.musica + " está tocando.");
        } else {
            this.play = true;
            this.pause = false;
            System.out.println("A ultima música selecionada: " + this.musica + ", está tocando.");
        }
    }

    public void pausar() {
        if (this.pause == false) {
            this.pause = true;
            this.play = false;
            System.out.println("A música foi pausada");
        } else {
            System.out.println("A música está pausada");
        }
    }

    public void selecionarMusica(String musica) {
        this.musica = musica;
        tocar();
    }
}
