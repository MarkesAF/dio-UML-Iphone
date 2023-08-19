package entities;

public class NavegadorInternet implements NavegadorInternetIN {
    private int abasAbertas;

    public NavegadorInternet(){
    }

    public NavegadorInternet(int abasAbertas){
        this.abasAbertas = abasAbertas;
    }
    public int getAbasAbertas(){
        return abasAbertas;
    }
    public void setAbasAbertas(int abasAbertas){
        this.abasAbertas = abasAbertas;
    }
    @Override
    public void exibirPagina(){
        System.out.println("Exibindo pagina");
    }
    @Override
    public void adicionarNovaAba(){
        abasAbertas++;
        System.out.println("Aba adicionada. Total de abas abertas: "+abasAbertas);
    }
    @Override
    public void atualizarPagina(){
        System.out.println("Pagina atualizada");
    }
}
