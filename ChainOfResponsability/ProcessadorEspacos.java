package ChainOfResponsability;

public class ProcessadorEspacos implements Processador {
    Processador sucessor;
    public void SetSucessor(Processador sucessor){
        this.sucessor = sucessor;
    }

    public void Executar(String texto){
        int count = 0;
        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            if (caractere == ' '){
                count++;
            }
        }
        System.out.println("Existem "+count+" \"espaços\" no texto \n");


        if (sucessor != null){
            sucessor.Executar(texto);
        }
    }
}
