package aLeonardoROdriguesSouza.aula20200826.carro;

public class Carro {
    private boolean ligado = false;
    private double VolumeCombustivelTanqueLitros = 0.00;
    private double capacidadeTanquemLitros = 0.00;

    public Carro(final double capacidadeTanquemLitros) {
        //"Capacidade maxima de combustivel em litros do tanque não pode ser 0 ou negativo");
        this.capacidadeTanquemLitros = capacidadeTanquemLitros;
    }

    public void abastecer(final double volumeAbastecidoLitros){
        if(volumeAbastecidoLitros <= 0.00 )
            throw new RuntimeException("Volume para abastecimento em litros não pode ser 0 ou negativo");
       
        if (capacidadeTanquemLitros < volumeAbastecidoLitros + VolumeCombustivelTanqueLitros )
            throw new RuntimeException(
                "o tanque só suporta: "
                +capacidadeTanquemLitros
                + " litros. abastecimento excessivo em: " 
                + (volumeAbastecidoLitros + VolumeCombustivelTanqueLitros) 
                + "litros");
        VolumeCombustivelTanqueLitros += volumeAbastecidoLitros;
        System.out.println("Abastecimento de "+volumeAbastecidoLitros+" litros realizado com sucesso.");
        System.out.println("Quantidade atual de combustivel no tanque: "+VolumeCombustivelTanqueLitros);
        System.out.println();
    }
    
    public void ligar() {
        VolumeCombustivelTanqueLitros -= 0.05;
        ligado = true;
    }

	public boolean isLigado() {
		return ligado;
	}

	public double getVolCombustivelL() {
        return VolumeCombustivelTanqueLitros;		
    }    
}