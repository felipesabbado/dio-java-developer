import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void ligar(String numero) {
        System.out.println("IPHONE: LIGANDO");
    }

    @Override
    public void atender() {
        System.out.println("IPHONE: ATENDENDO");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("IPHONE: INICIANDO CORREIO DE VOZ");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("IPHONE: EXIBINDO PÁGINA WEB");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("IPHONE: ADICIONANDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("IPHONE: ATUALIZANDO PÁGINA WEB");
    }

    @Override
    public void tocar() {
        System.out.println("IPHONE: TOCANDO MÍDIA");
    }

    @Override
    public void pausar() {
        System.out.println("IPHONE: PAUSANDO MÍDIA");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("IPHONE: SELECIONANDO MÚSICA");
    }
}
