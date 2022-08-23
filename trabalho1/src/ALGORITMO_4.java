package trabalho1.src;

public class ALGORITMO_4 {
    public static int f( int n ) {
        int i, j, k, res = 0;
        int cont_op = 0;
        for( i = n/2; i <= n*n; i += 1 )
        for( j = 1; j <= n*n; j += i/2+1 )
        for( k = 2; k <= i*j; k += j/2+1 ) {
        res = res + n-1;
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
