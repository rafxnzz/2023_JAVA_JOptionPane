import javax.swing.JOptionPane;

public class Exercicio1 
{
    public static void main(String[] args) 
    {
        String NM;

        NM = JOptionPane.showInputDialog("Digite o nome de usuário");
        JOptionPane.showMessageDialog(null, "Bem vindo(a) de volta senhor(a) " +NM);   
    }
}