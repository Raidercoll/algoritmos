public class Exercicio1{

    public static int somatorio(int n){
        return n>1 ? n+somatorio(n-1) : 1;
        // if(n>1){
        //     return n + somatorio(n-1);
        // }else{
        //     return 1;
        // }

    }

    public static void main(String[] args) {

        System.out.println(somatorio(5));
    }
}