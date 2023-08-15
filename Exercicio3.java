import javax.swing.JOptionPane;

public class Exercicio3 
{
    public static void main(String[] args) 
    {
        Double V1, V2, R;
        V1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o dividendo"));
        V2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o divisor"));

        R = V1 / V2;
        JOptionPane.showMessageDialog(null, "O resultado dessa divisão é igual a: "+R);
    }
}
