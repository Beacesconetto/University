import javax.swing.JOptionPane;
// i = linha e j = coluna
public class exercicio26 {
    public static void main(String[] args) {

//para começar a matriz

    int A[ ][ ] = new int[ 3 ] [ 3 ];

int i, j;

// leitura dos valores

for( i = 0; i < 3; i++) {

for ( j = 0; j < 3; j++) {
A[i][j] = Integer.parseInt(
    JOptionPane.showInputDialog( "Digite o valor da linha " +i+ " e coluna " +j+ ": " )
 );
        }
    }

// escrita dos valores

for( i = 0; i < 3; i++) {

for ( j = 0; j < 3; j++) {
JOptionPane.showMessageDialog( null, "O valor contido na linha " +i+ " e coluna " +j+ " é " + A [ i ] [ j ] );
        } 
    }

int soma = 0;

//a) Calcule e mostre a soma dos elementos da primeira coluna
for (i = 0; i < 3; i++){
    
    soma = soma + A[i][0];
    JOptionPane.showMessageDialog(null, "A soma dos elementos da primeira coluna é: " + soma);
    }

//b) Calcule e mostre a soma dos elementos de cada coluna

int coll[] = new int [3];// perguntar pq essa linha

for ( i = 0; i < 3; i++){
    for ( j = 0; j < 3; j++){

        coll[i] = coll[i] + A[i][j];
        JOptionPane.showMessageDialog(null, " \n Coluna 0: " + coll[0] + "\n Coluna 1: " + coll[1] + "\n Coluna 2:" + coll[2] );
        }
    }
//c) Calcule e mostre o produto dos elementos da primeira linha
int mult = 0;
for (j = 0; j < 3; j++) {
    mult = mult * A[0][j];
    JOptionPane.showMessageDialog(null, "O produto dos elementos da primeira linha é: " + mult);
}

//d)Calcule e mostre a soma de todos os elementos da matriz

int all = 0;
for (i = 0; i < 3;i++) {
    for (j = 0; j < 3; j++){
        all = all + A[i][j];
        JOptionPane.showMessageDialog(null, "A soma de todos os elementos da matriz é: " + all);
    }
}

//e)Calcule e mostre a média de todos os elementos da matriz
int media = 0;
media = all/9;
JOptionPane.showMessageDialog(null, " A média dos ewlementos da matriz é: " +media);


//f)Calcule e mostre os elementos queb são amoires que a média
String maior_media = "";

for (i = 0; i < 3; i ++){
        for (j = 0; j < 3; j++){
            if ( A[i][j] > media ) {
                maior_media = maior_media + ": " + A [i][j];
            }
        }
}

JOptionPane.showMessageDialog(null, " Os elementos maiores que a média são: " + maior_media);


//g)Calcule e mostre o maior elemento da matriz e sua posição
int maior = 0;
int lin_maior = 0;
int col_maior = 0;

for (i = 0; i < 3; i ++){
    for (j  = 0; j < 3; j++){
        if (A[i][j] > maior) {
            maior = A[i][j];
            lin_maior = i;
            col_maior = j;
        }
    }
}
JOptionPane.showMessageDialog(null, "O maior elemento está na posição: \n Maior: " + maior + "\n Linha: " + lin_maior + "\n Coluna: " + col_maior);



//h)Calcule e motre o menor elemento da matriz e sua posição
int menor = 999999;
int lin_menor = 0;
int col_menor = 0;

for (i = 0; i < 3; i++){
    for(j = 0; j < 3; j++) {
        if (A[i][j] < menor) {
            menor = A[i][j];
            lin_menor = i;
            col_menor = j;

        }
    } 
}
JOptionPane.showMessageDialog(null, "O menor elemento esá na posição : \n Menor: " + menor + "\n Linha: " + lin_menor + "\n Coluna: " + col_menor);



}

} 


