import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int resposta, par = 0, impar = 0, soma = 0, contador = 0, maisQueCem = 0;
        do {
            System.out.print("Digite a respota, digite 0 para finalizar: ");
            resposta = scan.nextInt();
            if (resposta % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            if (resposta > 100) {
                maisQueCem++;
            }
            soma = soma + resposta;
            contador++;
        } while (resposta != 0);
        int media = soma/contador;
        System.out.println("Foi(ram) digitado(s) " + (contador - 1) + " numero(s)");
        System.out.println("Foi(ram) digitado(s) " + (par - 1) + " par(es)");
        System.out.println("Foi(ram) digitado(s) " + impar + " impar(es)");
        System.out.println("A media do(s) numero(s) foi " + media);
        System.out.println("Foi(ram) digitado(s) " + maisQueCem + " numero(s) maior(es) que 100");

    }
}
