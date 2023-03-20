import javax.swing.JOptionPane;

public class Exercicio9 {
    public static void main (String[] args){

    int peso;
    peso = Integer.parseInt(
        JOptionPane.showInputDialog("Qual o seu peso?")
    );

    Double altura;
    altura = Double.parseDouble(
        JOptionPane.showInputDialog("Qual a sua altura?")  
    );
    
    Double IMC;
    //não precisa botar o parse porque o messagedialog aceita double porem o inputdialog aceita só string
    IMC = peso / (altura * altura);
    JOptionPane.showMessageDialog(null, IMC, "IMC", 1);
    }
}
