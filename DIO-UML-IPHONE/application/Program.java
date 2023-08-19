package application;

import java.util.Scanner;
import java.util.Locale;

import entities.*;

public class Program {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        //reprodutor
        ReprodutorMusicalIN reprodutor = new ReprodutorMusical();
        reprodutor.pausar();
        reprodutor.selecionarMusica();
        reprodutor.tocar();

        //AparelhoTelefonico
        AparelhoTelefonicoIN aparelho = new AparelhoTelefonico();
        aparelho.atender();
        aparelho.correioDeVoz();
        aparelho.ligar();

        //Navegador Internet
        NavegadorInternetIN nav = new NavegadorInternet();
        nav.atualizarPagina();
        nav.adicionarNovaAba();
        nav.exibirPagina();
    }
}
