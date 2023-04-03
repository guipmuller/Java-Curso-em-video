
public class Exercicio4 {

    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;
        int maior;
        // operador lógico
        if (n1 > n2) {
            maior = n1;
        } else {
            maior = n2;
        }
        System.out.println(maior);
        //#####################################
        
        int n3 = 1;
        int n4 = 2;
        int maior1;
        // operador ternário
        maior1 = n3>n4?n3:n4; // (condição)?(resultado caso true):(resultado caso false)
        System.out.println(maior1);
    }
}