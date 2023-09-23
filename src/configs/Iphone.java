package configs;

public class Iphone {

    private NavegadorInternet internet;
    private AparelhoTelefonico telefone;
    private ReprodutorMusical musica;

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

    public Iphone() {
        internet = new NavegadorInternet();
        telefone = new AparelhoTelefonico();
        musica = new ReprodutorMusical();
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
        telefone.realizarChamada();
    }

    public void atenderLigacao() {
        telefone.atenderLigacao();
    }

    public void iniciarCorreioVoz() {
        telefone.iniciarCorreioVoz();
    }

    //Navegador Internet
    public void exibirPagina() {
        internet.exibirPagina();
    }

    public void adicionarNovaAba() {
        internet.adicionarNovaAba();
    }

    public void atualizarPagina() {
        internet.atualizarPagina();
    }

    //Reprodutor Musical
    public void tocarMusica(){
        musica.tocarMusica();
    }

    public void pausarMusica(){
        musica.pausarMusica();
    }

    public void selecionarMusica(){
        musica.selecionarMusica();
    }
    

    
}
