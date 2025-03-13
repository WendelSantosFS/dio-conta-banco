import Iphone.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone iphone1= new Iphone();

        iphone1.selecionarMusica("Sozinho: Caetano velozo");
        iphone1.tocar();
        iphone1.pausar();
        System.out.println("===============================");

        iphone1.exibirPagina("www.google.com");
        iphone1.adicionarNovaAba();
        iphone1.atualizarPagina();

        System.out.println("===============================");
        iphone1.ligar("99292-3333");
        iphone1.atender();
        iphone1.iniciarCorreioVoz();

    }
}