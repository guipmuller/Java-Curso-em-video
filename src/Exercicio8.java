import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        // fatorial
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o número a ser calculado: ");
        int number = scan.nextInt();
        long fatorial = 1;
        int count = 0;
        while (count < number) {
            count ++;
            fatorial = fatorial * count;
        }
        System.out.println("!" + number + " = " + fatorial);
    }
}
