package trabalho1.src;

public class ALGORITMO_1 {
    public static int f(int n) {
        int i, j, k, res = 0;
        int cont_op = 0;
        for( i = n; i <= n+1; i += 1 )
        for( j = n+1; j <= n+i; j += i )
        for( k = 1; k <= i*i; k += i/2+1 ) {
        res = res + i;
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
