
public class ExerPOO1 {
    public static void main(String[] args) {
        ExerPOO1b caneta1 = new ExerPOO1b();
        caneta1.cor = "Azul";
        caneta1.ponta = 0.5f;
        caneta1.destampar();
        caneta1.status();
        caneta1.rabiscar();
        
        System.out.println();
        ExerPOO1b caneta2 = new ExerPOO1b();
        caneta2.modelo = "Bic";
        caneta2.cor = "Preta";
        caneta2.tampar();
        caneta2.status();
        caneta2.rabiscar();
    }   
}
