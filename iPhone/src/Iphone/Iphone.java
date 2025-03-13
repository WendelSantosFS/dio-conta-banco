package Iphone;

import Iphone.recursos.reprodutorMusical.reprodutorMusical;
import Iphone.recursos.navegadorInternet.navegadorInternet;
import Iphone.recursos.aparelhoTelefonico.aparelhoTelefonico;


public class Iphone implements reprodutorMusical, navegadorInternet, aparelhoTelefonico {

    public void selecionarMusica(String musica) {
        System.out.println("Você escolheu a música: "+ musica);
    }
    public void tocar() {
        System.out.println("Está tocando a música");
    }
    public void pausar(){
        System.out.println("A música foi pausada!");
    }



    public void exibirPagina(String url) {
        System.out.println("Você está exibindo a página da URL: " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }
    public void atualizarPagina() {
        System.out.println("A página foi atualizada.");
    }


    public void ligar(String numero) {
        System.out.println("Você está ligando para o número: " + numero);
    }
    public void atender() {
        System.out.println("Atendendo chamada.");
    }
    public void iniciarCorreioVoz() {
        System.out.println("O correio de voz foi iniciado.");
    }
}
