package aLeonardoROdriguesSouza.aula20200826.carro;

public class Validacoes {

    public static void excecaoSeMenorOuIgualZero(double Valor, String mensagemErro) {
        if(Valor <= 0)
            throw new RuntimeException(mensagemErro);
    }
}
