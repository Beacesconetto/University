import javax.swing.JOptionPane;

public class exercicio16 {
    public static void main (String [] args ) {
        double num1;
        num1 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite um número")
        );

        double num2;
        num2 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite outro número")
        );

        double a,m,s,d;
        a = num1 + num2;
        m = num1 * num2;
        s = num1 - num2;
        d = num1 / num2;
        JOptionPane.showMessageDialog(null, "O resultado da adição é \n" + a );
        JOptionPane.showMessageDialog(null,"O resultado da multiplicação é \n" + m);
        JOptionPane.showMessageDialog(null, "O resultado da Subtração é \n" + s);
        JOptionPane.showMessageDialog(null,"O resultado da divisão é \n" + d);
    }
}
