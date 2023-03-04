import javax.swing.JOptionPane;

public class exercicio13 {
    public static void main (String [] args) {
       double salario;
       salario = Double.parseDouble(
        JOptionPane.showInputDialog("Digite seu salário")
       );

       double prestacao;
       prestacao = Double.parseDouble(
        JOptionPane.showInputDialog("Digite o valor da prestação")
       );
       
       double res;
       res = (salario*30)/100;

       if (prestacao <= res ) {
        JOptionPane.showMessageDialog(null, "O empréstipo pode ser concedido! ");
       } else {
        JOptionPane.showMessageDialog(null, "O empréstimo não poderá ser!");
       }
    }
}
