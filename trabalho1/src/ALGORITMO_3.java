package trabalho1.src;

public class ALGORITMO_3 {
    public static int f( int n ) {
        int i, j, k, res = 0;
        int cont_op = 0;
        for( i = n+1; i <= n+1; i += 1 )
        for( j = n; j <= i+1; j += j/2+1 )
        for( k = j; k <= n*j; k += Math.abs(j-i)+1 ) {
        res = res + n*k;
        cont_op++;
        }
        return cont_op;
    }

    public static void main(String[] args) {
        for(int i = 0; i <= 100; i ++){
            System.out.println( f(i));
    
                
            }
    }
    
}
