import javax.swing.JOptionPane;

public class exercicio22 {
    public static void main(String[] args) {
        int i = 1;
        int soma = 0;
        int total = 0;

        while (i <= 1000 ){
            soma += i;
            total++;
            i++;
        }
        JOptionPane.showMessageDialog(null, soma);
        double media = soma / total;
        JOptionPane.showMessageDialog(null," A média é: " + media);

    }
}
