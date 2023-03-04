import javax.swing.JOptionPane;

public class exemplo1e2_aula4 {
    public static  void  main (String[] agrs){
        double num;
        num = Double.parseDouble(
            JOptionPane.showInputDialog("Digite um número: ")

        );
        if ( num >10 ) {
            double metade = num / 2;
            JOptionPane.showMessageDialog(null, "A metade é: " + metade );
        }
        else{ 
            double dobro = num * 2;
            JOptionPane.showMessageDialog(null, "O dobro será: " + dobro );
        }
    }

}
