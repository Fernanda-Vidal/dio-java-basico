public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A tv está ligada? " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("A tv está ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("A tv está ligada? " + smartTv.ligada);


        System.out.println("Qual o volume da tv? " + smartTv.volume);
        
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual " + smartTv.volume);

        
        System.out.println("A tv está em qual canal? " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("A tv está no canal: " + smartTv.canal);
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("A tv está no canal: " + smartTv.canal);
        
        smartTv.mudarDeCanal(31);
        System.out.println("A tv está no canal: " + smartTv.canal);


    }
}
