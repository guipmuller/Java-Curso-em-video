import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        // fatorial
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o número a ser calculado: ");
        int fatorial = scan.nextInt();
        int count = fatorial;
        String exibition = "";
        while (count > 1) { 
            exibition = exibition + (count + " * ");
            count--;
            fatorial = fatorial * count;
        }
        exibition = exibition + ("1 ");
        System.out.println(exibition + " = " + fatorial);
    }
}
