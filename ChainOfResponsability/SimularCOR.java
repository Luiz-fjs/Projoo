package ChainOfResponsability;

public class SimularCOR {
    public static void main(String[] args) {
        String texto = "Esse é um texto pra teste. Se tiver uma citação[...]. Tem vários espaços. AAAAAAAaaaa que susto.";

        Processador p1 = new ProcessadorEspacos();
        Processador p2 = new ProcessadorLetrasA();
        Processador p3 = new ProcessadorNumeroPontos();

        p1.SetSucessor(p2);
        p2.SetSucessor(p3);

        p1.Executar(texto);
    }
}
