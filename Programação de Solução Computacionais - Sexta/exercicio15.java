import javax.swing.JOptionPane;

public class exercicio15 {
    public static void main (String [] args) {
        String nome;
        nome = JOptionPane.showInputDialog("Qual o seu nome?");

        int idade;
        idade = Integer.parseInt(
            JOptionPane.showInputDialog("Qual a sua idade?")
        );

        if ( idade >= 15 && idade <= 25 ) {
            JOptionPane.showMessageDialog(null, "Aceita \n" + nome);
        }
        else {
             JOptionPane.showMessageDialog(null, "Não Aceita \n" + nome);
            }
        
        
    }
}
