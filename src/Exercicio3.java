import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args) {
        // pre e pos incremento
        int valorA = 5;
        int numeroA = 10 + valorA++;
        System.out.println(valorA);
        System.out.println(numeroA);

        int valorB = 5;
        int numeroB = 10 + ++valorB;
        System.out.println(valorB);
        System.out.println(numeroB);

        // exponenciação
        int dadoC = (int) Math.pow(5,2);
        System.out.print("5 elevado a 2 é " + dadoC + "\n");

        // valor absoluto (modulo)
        int dadoD = Math.abs(-10);
        System.out.println(dadoD);

        // numero aleatório entre 0 e 1
        double aleatorio1 = Math.random();
        System.out.println(aleatorio1);

        // numero aleatório entre 1 e 100
        double aleatorio2 = Math.random();
        int aleatorio3 = (int) (1 + aleatorio2 * (100-1));
        System.out.println(aleatorio3);

        // Calculadora
        Scanner scan = new Scanner(System.in);
        do {
        System.out.print("Digite um número entre maior do que 3: ");
        int entrada = scan.nextInt();
            if (entrada < 3) {
                System.out.println("Digite um número maior do que 3.");
            } else {
                int somaTres = entrada + 3;
                int diminuiTres = entrada - 3;
                int multiplicaPorTres = entrada * 3;
                int dividePorTres = entrada / 3;
                int restoDivisao = entrada % 3;
                int elevaAoCubo = (int) Math.pow(entrada,3);;
                double raizQuadrada = Math.sqrt(entrada);
                double raizCubica = Math.cbrt(entrada);
                int valorAbsoluto =  Math.abs(entrada);
    
                System.out.println("O numero " + entrada + " + 3 é: " + somaTres);
                System.out.println("O numero " + entrada + " - 3 é: " + diminuiTres);
                System.out.println("O numero " + entrada + " x 3 é: " + multiplicaPorTres);
                System.out.println("O numero " + entrada + " / 3 é: " + dividePorTres);
                System.out.println("O resto da divisão de " + entrada + " por 3 é: " + restoDivisao);
                System.out.println("O numero " + entrada + " elevado ao cubo é: " + elevaAoCubo);
                System.out.println("A raíz quadrada de " + entrada + " é: " + raizQuadrada);
                System.out.println("A raíz cúbica de " + entrada + " é: " + raizCubica);
                System.out.println("O valor absoluto de " + entrada + " é: " + valorAbsoluto);
                
            }
        } while (true);
    }
}
