import javax.swing.JOptionPane;

public class exercicio18 {
    public static void main(String[] args) {
    String nome;
    nome = JOptionPane.showInputDialog("Digite o seu nome");

    Double valor;
    valor = Double.parseDouble(
        JOptionPane.showInputDialog("Digite o valor do produto")
    );

    String escolha;
    escolha = JOptionPane.showInputDialog("Qual a categoria? \n A - 10% \n B - 15% \n C - 20% \n D - 25% \n E - 50%");
    char escolhaCHAR = escolha.charAt(0);

      switch(escolhaCHAR) {
        case 'A':
        Double off10 = ( valor * 10 ) / 100 ;
        Double desconto10 = valor - off10;
        JOptionPane.showMessageDialog(null,"o valor que deve ser pago por " + nome + " \n é \n " + desconto10 );
        break;

        case 'B':
        Double off15 = ( valor * 15 ) / 100;
        Double desconto15 = valor - off15;
        JOptionPane.showMessageDialog(null,"o valor que deve ser pago por " + nome + "\n é  \n " + desconto15 );
        break;

        case 'C':
        Double off20 = ( valor * 20 ) / 100;
        Double desconto20 = valor - off20;
        JOptionPane.showMessageDialog(null,"o valor que deve ser pago por " + nome + "\n é \n" + desconto20 );
        break;

        case 'D':
        Double off25 = ( valor * 25 ) / 100;
        Double desconto25 = valor - off25;
        JOptionPane.showMessageDialog(null,"o valor que deve ser pago por " + nome + "\n é \n" + desconto25 );
        break;

        case 'E':
        Double off50 = ( valor * 50 ) / 100;
        Double desconto50 = valor - off50;
        JOptionPane.showMessageDialog(null,"o valor que deve ser pago por " + nome + "\n é \n " + desconto50 );
        break;

        default:
        JOptionPane.showMessageDialog(null, "Não contém essa opção");
        break;
        
    }

    }
}
