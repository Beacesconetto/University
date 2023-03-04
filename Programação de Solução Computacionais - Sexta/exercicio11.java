import javax.swing.JOptionPane;

public class exercicio11 {
    public static void main (String [] args) {
        int num;
        num = Integer.parseInt(
            JOptionPane.showInputDialog("Digite um número ")
        );

        if ( (num % 2) == 0 ){
            JOptionPane.showMessageDialog(null, "È múltiplo de 2! ");
        } else {
            JOptionPane.showMessageDialog(null, "Não é múltiplo de 2!");
        }
    }
}
