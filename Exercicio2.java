import javax.swing.JOptionPane;

public class Exercicio2
{
    public static void main(String[] args) 
    {
        Double n1, n2, r;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero da soma"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero da soma"));
        r = n1 + n2;

        JOptionPane.showMessageDialog(null, "O resultado da some é igual a: " +r );
        
    }    
}