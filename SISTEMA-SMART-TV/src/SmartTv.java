public class SmartTv {
    boolean ligada = false;
    int canal = 5;
    int volume = 11;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void mudarDeCanal(int novoCanal) {
        canal = novoCanal;
    }
}
