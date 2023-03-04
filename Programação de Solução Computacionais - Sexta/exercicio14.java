import javax.swing.JOptionPane;

public class exercicio14 {
    public static void main (String [] args ) {
        int ano1;
        ano1 = Integer.parseInt(
            JOptionPane.showInputDialog("Qual o seu ano de nascimento? ")
        );

        int ano2;
        ano2 = Integer.parseInt(
            JOptionPane.showInputDialog("Qual o ano atual?")
        );
        
        int idade;
        idade = ano2 - ano1;
        if ( ano1 < ano2 ) {
            JOptionPane.showMessageDialog(null, "A sua idade é \n" + idade);
        }
    }
}
