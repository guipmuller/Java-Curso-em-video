import java.util.Calendar;
import java.util.Scanner;

public class Exercicio2 {
   
    public static void main(String[] args) {
        //conversão de inteiro para string
        int dado1 = 20;
        String dado2 = Integer.toString(dado1);
        System.out.println(dado2);
        // conversão de string para inteiro
        String valor1 = "30";
        int valor2 = Integer.parseInt(valor1); 
        System.out.println(valor2);
        // conversão de float para String
        float data1 = 50.60f;
        String data2 = Float.toString(data1);
        System.out.println(data2);
        // conversão de string para float
        String alg1 = "40.50";
        float alg2 = Float.parseFloat(alg1);
        System.out.println(alg2);

        // calculadora de idade
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o ano do seu nascimento: ");
        int anoNascimento = scan.nextInt();
        Calendar calendario = Calendar.getInstance();
        int anoAtual = calendario.get(Calendar.YEAR);
        int idade = anoAtual - anoNascimento;
        System.out.println("A idade é " + idade);
        scan.close();

   }
}
