
public class EP1 {
    public static void main(String[] args) {
        ExP1Caneta caneta1 = new ExP1Caneta();
        caneta1.cor = "Azul";
        caneta1.ponta = 0.5f;
        caneta1.destampar();
        caneta1.status();
        caneta1.rabiscar();
        
        System.out.println();
        ExP1Caneta caneta2 = new ExP1Caneta();
        caneta2.modelo = "Bic";
        caneta2.cor = "Preta";
        caneta2.tampar();
        caneta2.status();
        caneta2.rabiscar();
    }   
}
