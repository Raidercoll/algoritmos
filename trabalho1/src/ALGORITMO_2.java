package trabalho1.src;

public class ALGORITMO_2 {

    public static int f( int n ) {
        int i, j, k, res = 0;
        int cont_op = 0;
        for( i = n; i <= n+1; i += 2 )
        for( j = n+1; j <= n*n; j += 2 )
        for( k = i+1; k <= 2*n; k += 2 ) {
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
