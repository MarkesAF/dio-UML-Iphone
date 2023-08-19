package entities;

public class ReprodutorMusical implements ReprodutorMusicalIN{

    private boolean estaTocando;

    public ReprodutorMusical(){
    }

    public ReprodutorMusical(boolean estaTocando){
        this.estaTocando = estaTocando;
    }
    @Override
    public void tocar(){
        if(!estaTocando){
            System.out.println("Iniciando reprodução");
            estaTocando = true;
        }else{
            System.out.println("O reprodutor ja esta tocando");
        }
    }
    @Override
    public void pausar(){
        if(estaTocando){
            System.out.println("Reproduçao pausada");
            estaTocando = false;
        }else{
            System.out.println("O reprodutor ja esta pausado");
        }
    }
    @Override
    public void selecionarMusica(){
        System.out.println("Musica selecionada");
    }

}
