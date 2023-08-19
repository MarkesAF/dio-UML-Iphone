package entities;

public class AparelhoTelefonico implements AparelhoTelefonicoIN {
    private boolean estaLigado;

    public AparelhoTelefonico(){
    }
    public AparelhoTelefonico(boolean estaLigado){
        this.estaLigado = estaLigado;
    }
    @Override
    public void ligar(){
        if(!estaLigado){
            System.out.println("Aparelho está ligando");
            estaLigado = true;
        }else{
            System.out.println("O aparelho esta ligado");
        }
    }
    @Override
    public void atender(){
        System.out.println("Chamada atendida");
    }
    @Override
    public void correioDeVoz(){
        System.out.println("Correio de voz iniciando");
    }

}
