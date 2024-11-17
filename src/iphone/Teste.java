package iphone;
public class Teste {
    public static void main(String[] args) {
        // Criando um objeto iPhone
        iPhone iphone = new iPhone();

        // Testando o Reprodutor Musical
        iphone.tocar();
        iphone.pausar();
        iphone.parar();

        // Testando o Aparelho Telefônico
        iphone.fazerChamada("(81)9 8585-8585");
        iphone.receberChamada("(81)9 5858-5858");

        // Testando o Navegador Internet
        iphone.abrirPagina("www.google.com");
    }
}

