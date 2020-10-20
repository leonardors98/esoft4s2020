package aLeonardoROdriguesSouza.aula20200826.carro;

public class AppCarro {
    public static void main(String[] args) {
        System.out.println("Iniciando o programa...\n");
        Carro novo = new Carro(52.00);
        novo.abastecer(30.5);
        novo.abastecer(10.5);
        novo.ligar();
        boolean carroLigado = novo.isLigado();
        double volumeEmLitros = novo.getVolCombustivelL();
    
        System.out.println("O carro está ligado? " + carroLigado + ", combustivel no tanque= " + volumeEmLitros);
    
        System.out.println("Programa finalizado.");
    }
}

