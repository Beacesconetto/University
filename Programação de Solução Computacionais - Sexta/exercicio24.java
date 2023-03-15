import javax.swing.JOptionPane;

public class exercicio24 {
    public static void main(String[] args) {
        int i = 13; 

		  do{
		    i++;
		    if(( i % 2 ) == 0 ){
			   JOptionPane.showMessageDialog(null,"É par: " + i); 
			}
		  }while( i < 23 );	
    }
    
}
