package aLeonardoROdriguesSouza.aula20200826.carro;

public class DecimalPositivo {
    private double valor;

    public DecimalPositivo(double valor, String mensagemErro){
        Validacoes.excecaoSeMenorOuIgualZero(valor,mensagemErro);

        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
