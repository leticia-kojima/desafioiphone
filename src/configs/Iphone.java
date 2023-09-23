package configs;

public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical{

    private String modeloCelular;
    private int anoFabricacao;

    public String getModeloCelular(){
        return modeloCelular;
    }

    public void setModeloCelular(String newModeloCelular){
        modeloCelular = newModeloCelular;
    }

    public int getAnoFabricacao(){
        return anoFabricacao;
    }

    public void setAnoFabricacao(int newAnoFabricacao){
        anoFabricacao = newAnoFabricacao;
    }

    public void IphoneConfig(String modeloCelular, int anoFabricacao) {
        this.modeloCelular = modeloCelular;
        this.anoFabricacao = anoFabricacao;

        System.out.println("O modelo é " + modeloCelular + 
                            " e o ano de fabricação "+ anoFabricacao +
                            ". Seja bem vindo!");
    }

    //Aparelho Telefonico
    public void realizarChamada() {
        System.out.println("Realizando chamada - Aparelho Telefonico");
    }

    public void atenderLigacao() {
        System.out.println("Atendendo ligação - Aparelho Telefonico");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de voz - Aparelho Telefonico");
    }

    //Navegador Internet
    public void exibirPagina() {
        System.out.println("Exibindo página - Navegador Internet");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando aba - Navegador Internet");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina  - Navegador Internet");
    }

    //Reprodutor Musical
    public void tocarMusica(){
        System.out.println("Tocando música - Reprodutor Musical");
    }

    public void pausarMusica(){
        System.out.println("Pausando música - Reprodutor Musical");
    }

    public void selecionarMusica(){
        System.out.println("Selecionando música - Reprodutor Musical");
    }
    

    
}
