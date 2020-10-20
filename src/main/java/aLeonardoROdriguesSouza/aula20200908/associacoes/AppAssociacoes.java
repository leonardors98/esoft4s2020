package aLeonardoROdriguesSouza.aula20200908.associacoes;

public class AppAssociacoes {
    
public static void main(String[] args) {
    Pessoa Josias = new Pessoa("Josias josias");

    Endereco avBrasil777 = new Endereco ("Av brasil","777");
    Endereco avSaoDomingos123 = new Endereco("av","11");

    Josias.addEndereco(avSaoDomingos123);
    Josias.addEndereco(avBrasil777);
}

    private static void Pessoa(String string) {

    }

}
