import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        //tipos de triangulo
        int a, b, c, resultado;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o lado A: ");
        a = scan.nextInt();
        System.out.print("Digite o lado B: ");
        b = scan.nextInt();
        System.out.print("Digite o lado C: ");
        c = scan.nextInt();
        // verifica se é um triangulo
        if (a<(b+c) && b<(a+c) && c<(a+b) ) {
            System.out.println("Forma um triângulo.");
        } else {
            System.out.println("Não forma um triângulo.");
        }
        // verifica que tipo de triangulo
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Medida inválida.");
        } else {
            if (a == b && a == c) {
                System.out.println("Triangulo equilátero");
            } else if ((a == b || a == c)) {
                System.out.println("Triangulo isóceles");
            } else {
                System.out.println("Triangulo escaleno");
            }
        }
    }
}
