package ChainOfResponsability;

public class ProcessadorLetrasA implements Processador {
    Processador sucessor;
    public void SetSucessor(Processador sucessor){
        this.sucessor = sucessor;
    }

    public void Executar(String texto){
        int count = 0;
        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            if (caractere == 'a' || caractere == 'A'){
                count++;
            }
        }
        System.out.println("Existem "+count+" \"a\" no texto \n");

        if (sucessor != null){
            sucessor.Executar(texto);
        }
    }
}
