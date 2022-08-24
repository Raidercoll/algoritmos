public class Exercicio2 {
    public static String inverte(String str, int tam){
        if(tam ==0) return ""+ str.charAt(tam) +"";
        return str.charAt(tam) + inverte(str, tam-1);

    }

    public static void main(String[] args) {

        System.out.println(inverte("davi", "davi".length()-1));
    }
}
