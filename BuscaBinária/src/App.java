public class App {

    public int buscaBinaria(int[] lista, int num, int ini, int fim){
        int meio = (fim+ini)/2;

        if(num == lista[meio]){
            return num;
        }
        if(num > lista[meio]){
            return buscaBinaria(lista, num, meio, lista.length);
        }
        if(num < lista[meio]){
            return buscaBinaria(lista, num, lista[ini], meio);
        }
        return -1;
    }
    public static void main(String[] args) throws Exception {
        App a = new App();
        int[] list = {0,1,2,3,4,5,6,7,8};
        int b = 0;
        b = a.buscaBinaria(list, 8, 0, list.length);
        System.out.println("num: " + b);
    }
}
