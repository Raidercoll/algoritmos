public class Exercicio1{

    public static int somatorio(int n){
        return (n>0) ? n + somatorio(n-1) : n;
    }

    public static void main(String[] args) {

        System.out.println(somatorio(5));
    }
}
