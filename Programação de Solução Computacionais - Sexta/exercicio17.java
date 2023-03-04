import javax.swing.JOptionPane;

public class exercicio17 {
    public static void main(String[] args) {
     String controle;
        controle = JOptionPane.showInputDialog("Qual a sua profissão? " + " \n e - engenheiro \n m - médico \n d - designer \n p - programador \n a - advogado");
        char controleCHAR = controle.charAt(0);
        String nome;
        nome = "Tibúrcio";
        
        switch(controleCHAR) {
            case 'e':
            JOptionPane.showMessageDialog(null, " Tibúrcio é Egenheiro" );
            break;

            case 'm':
            JOptionPane.showMessageDialog(null, " Tibúcio é Médico " );
            break;

            case 'd':
            JOptionPane.showMessageDialog(null,  nome + " é Designer");
            break;

            case 'p':
            JOptionPane.showMessageDialog(null, nome + "é Programador");
            break;

            case 'a':
            JOptionPane.showMessageDialog(null, nome + "é Aedvogado");
            break;

            default:
                JOptionPane.showMessageDialog(null,  nome + " é Desempregado");
            break;


        }
    }
}
