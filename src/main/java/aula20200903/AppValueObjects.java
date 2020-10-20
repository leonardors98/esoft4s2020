package aula20200903;

import javax.swing.JOptionPane;

import aula20200903.valueObjects.Cnpj;
import aula20200903.valueObjects.Cpf;
import aula20200903.valueObjects.Nome;
import aula20200903.valueObjects.NomeFantasia;

public class AppValueObjects {

    public static void main(String[] args) {
        Nome nomeDigitado = new Nome(JOptionPane.showInputDialog(null, "Digite o nome: "));        
        NomeFantasia nomeFantasiaDigitado = new NomeFantasia(JOptionPane.showInputDialog(null, "Digite o nome: "));        
        Cpf cpfDigitado = new Cpf(JOptionPane.showInputDialog(null, "Digite o nome: "));        
        Cnpj cnpjDigitado = new Cnpj(JOptionPane.showInputDialog(null, "Digite o nome: "));        
        
        System.out.println(nomeDigitado);
        System.out.println(nomeFantasiaDigitado);
        System.out.println(cpfDigitado);
        System.out.println(cnpjDigitado);
    }
    
}
