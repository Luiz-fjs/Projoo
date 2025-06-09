package ChainOfResponsability;

public interface Processador {
    public void Executar(String texto);
    public void SetSucessor(Processador sucessor);
}
