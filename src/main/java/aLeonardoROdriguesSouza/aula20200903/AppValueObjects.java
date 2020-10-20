package aLeonardoROdriguesSouza.aula20200903;
import javax.swing.JOptionPane;

import aLeonardoROdriguesSouza.aula20200903.ValueObjects.Nome;

public class AppValueObjects{

    public static void main(String[] args) {
        Nome nomeDigitado = new Nome(JOptionPane.showInputDialog(null,"Digite o nome"));
        
        System.out.println(nomeDigitado);
    }
}