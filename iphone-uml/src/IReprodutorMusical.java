// IReprodutorMusical.java
public interface IReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

// IAparelhoTelefonico.java
public interface IAparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

// INavegadorInternet.java
public interface INavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

// IPhone.java
public class IPhone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet {
    // Implementação dos métodos de IReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    // Implementação dos métodos de IAparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Implementação dos métodos de INavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();

        // Testando Reprodutor Musical
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("Imagine - John Lennon");

        // Testando Aparelho Telefônico
        meuIPhone.ligar("123-456-7890");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testando Navegador na Internet
        meuIPhone.exibirPagina("https://www.example.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
