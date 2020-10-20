package aLeonardoROdriguesSouza.aula20200908.associacoes;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private List<Endereco> enderecos = new ArrayList<>();

    public Pessoa(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void addEndereco(Endereco novo){
        this.enderecos.add(novo);
    }
    

    @Override
    public String toString(){
        return "Pessoa [nome=" + nome + "]";
    }

}
