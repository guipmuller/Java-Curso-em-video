import java.util.Arrays;

public class Exercicio10 {
    public static void main(String[] args) {
        // vetor
        int num[] = {3,5,1,8,4};
        // for each, exclusivo para coleções
        for (int i : num) {
            System.out.println(i);
        }
        System.out.println();
        // ordenando vetores
        Arrays.sort(num);
        for (int i : num) {
            System.out.println(i);
        }
        System.out.println();
        // buscando vetores
        int posicao = Arrays.binarySearch(num, 1);
        System.out.println(posicao);
        // preenchendo vetores
        int num1[] = new int[20];
        Arrays.fill(num1, 0);
        for (int i : num1) {
            System.out.println(i);
        }
    }
}
