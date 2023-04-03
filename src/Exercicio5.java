import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        
        String nome1 = "Gui";
        String nome2 = "Gui";
        String nome3 = new String("Gui");
        System.out.println(nome1==nome2);
        System.out.println(nome1==nome3);
        System.out.println(nome1.equals(nome3));

        do {
            System.out.println("############################");
            System.out.println("Adivinhe o número");
            Scanner scan = new Scanner(System.in);
            System.out.print("Digite um número entre 1 e 5: ");
            int palpite = scan.nextInt();
            int numeroGerado = (int) (1 + Math.random() * 6-1);
            String resultado = palpite==numeroGerado?"ACERTOU":"ERROU";
            System.out.println(resultado + " pensei em " + numeroGerado);
        } while (true);
    }
}
