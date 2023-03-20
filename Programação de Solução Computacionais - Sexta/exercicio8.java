import javax.swing.JOptionPane;

public class exercicio8 {
     public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(
            JOptionPane.showInputDialog("Digite um número:")
        );
            JOptionPane.showMessageDialog(null, numero);
        numero = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o segundo numero:")
        );
            JOptionPane.showMessageDialog(null, numero);

        
    }
}