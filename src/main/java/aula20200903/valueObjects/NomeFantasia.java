package aula20200903.valueObjects;

public class NomeFantasia {
    private String valor;

    public NomeFantasia(String valor) {
        if (null == valor || valor.trim().length() == 0 || valor.trim().split(" ").length < 1) {
            throw new RuntimeException("O nome deve conter duas palavras!");
        }
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
    @Override
    public String toString() {
        return valor;
    }
}
