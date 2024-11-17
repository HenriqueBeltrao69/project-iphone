package iphone;
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação do ReprodutorMusical
    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void parar() {
        System.out.println("Música parada.");
    }

    // Implementação do AparelhoTelefonico
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }

    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de: " + numero);
    }

    // Implementação do NavegadorInternet
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }
}
