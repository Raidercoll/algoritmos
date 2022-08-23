package trabalho1.src;

public class ALGORITMO_5 {
    public static int f( int n ) {
        int i, j, k, res = 0;
        int cont_op = 0;
        for( i = n/2; i <= n+1; i += 2 )
        for( j = i; j <= n*i; j += i/2+1 )
        for( k = i+1; k <= n*j; k += 1 ) {
        res = res + k*j;
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
