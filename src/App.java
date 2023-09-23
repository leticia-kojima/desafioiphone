import java.util.Scanner;

import configs.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iniciando Iphone");
        System.out.println("Configurando iphone");

        System.out.println("Informe o modelo do iphone: ");
        String modelo = scanner.nextLine();
        System.out.println("Informe o ano de fabricação do iphone: ");
        Integer anoFabricacao = scanner.nextInt();

        Iphone iphone = new Iphone();
        iphone.IphoneConfig(modelo, anoFabricacao);

        System.out.println("O que deseja fazer? \nSelecione uma opção: \n 1) Aparelho Telefonico\n 2) Navegador Internet\n 3) Reprodutor Musical");
        Integer opcaoTelefone = scanner.nextInt();

        switch(opcaoTelefone){
            case 1:
                System.out.println("Opção Aparelho Telefonico");
                iphone.realizarChamada();
                iphone.atenderLigacao();
                iphone.iniciarCorreioVoz();
            case 2:
                System.out.println("Opção Navegador Internet");
                iphone.exibirPagina();
                iphone.adicionarNovaAba();
                iphone.atualizarPagina();
            case 3:
                System.out.println("Opção Reprodutor Musical");
                iphone.tocarMusica();
                iphone.pausarMusica();
                iphone.selecionarMusica();

            default:
                System.out.println("Opção inválida. Desligando Iphone");

        }
        
        scanner.close();

    }
}
