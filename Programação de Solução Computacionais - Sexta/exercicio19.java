import javax.swing.JOptionPane;

public class exercicio19 {
    public static void main(String[] args) {
        String frase;
        frase = JOptionPane.showInputDialog("Digite uma farse ");

        int valor;
        valor = Integer.parseInt(
            JOptionPane.showInputDialog("Quantas vezes a frase repete?")
        );
        for ( int i = 0 ; i < valor ; i++ ){
            JOptionPane.showMessageDialog(null, frase);
        }
    }
}


