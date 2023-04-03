import java.util.Scanner;

public class Exercicio6 {
    
    public static void main(String[] args) {
        // equação de 2º grau
        int numA, numB, numC, resultado;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite A: ");
        numA = scan.nextInt();
        System.out.print("Digite B: ");
        numB = scan.nextInt();
        System.out.print("Digite C: ");
        numC = scan.nextInt();

        int elevaQuadrado = (int) Math.pow(numB,2);;
        int raizQuadrada = (int) Math.sqrt((elevaQuadrado-(4*numA*numC)));

        resultado = (-numB+raizQuadrada)/(2*numA);
        System.out.println("x+ = " + resultado);
        resultado = (-numB-raizQuadrada)/(2*numA);
        System.out.println("x+ = " + resultado);
    }
}
