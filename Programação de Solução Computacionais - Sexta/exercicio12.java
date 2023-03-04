import javax.swing.JOptionPane;

public class exercicio12 {
    public static void main (String [] args) {
        int num1;
        num1 = Integer.parseInt(
            JOptionPane.showInputDialog("Digite um número ")
        );

        int num2;
        num2 = Integer.parseInt(
            JOptionPane.showInputDialog("Digite outro número ")
        );

        if ( num1 > num2 ) {
            JOptionPane.showMessageDialog(null, "O primeiro número é maior que o segundo \n"+  num1 );
        } else{
            if ( num2 > num1 ){
                JOptionPane.showMessageDialog(null, "O segundo número é maior que o primeiro \n" + num2 );
            }
            else{ 
                if ( num1 == num2 ) {
                    JOptionPane.showMessageDialog(null, "Os números são iguais " );
                }

                
            }
        }
    }
}
