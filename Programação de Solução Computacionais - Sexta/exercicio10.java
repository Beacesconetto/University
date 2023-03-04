import javax.swing.JOptionPane;

public class exercicio10 {
    public static void main (String[] args){
        int num1;
        num1 = Integer.parseInt(
            JOptionPane.showInputDialog("Digite um número ")
        );

        int num2;
        num2 = Integer.parseInt(
            JOptionPane.showInputDialog("Digite outro número ")
        );

        int resultado;
        resultado = num1 + num2;
        if (resultado>10) {
            JOptionPane.showMessageDialog(null,"O valor final é " + resultado );
        }else{
            JOptionPane.showMessageDialog(null, "O número é menor que 10");
        }
    } 
    
        

}
