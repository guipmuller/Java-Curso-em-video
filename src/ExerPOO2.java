public class EP2 {
    public static void main(String[] args) {
        ExP2Caneta caneta1 = new ExP2Caneta();
        caneta1.modelo = "bic cristal";
        caneta1.cor = "azul";
        // caneta1.ponta = 0.5f;
        caneta1.carga = 80;
        // caneta1.tampada = true;
        // caneta1.rabiscar();
        caneta1.tampar();
        caneta1.status();
        
        System.out.println();
        ExP2Caneta caneta2 = new ExP2Caneta();
        caneta2.status();
    }
}
