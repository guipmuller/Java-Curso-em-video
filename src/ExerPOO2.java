public class ExerPOO2 {
    public static void main(String[] args) {
        ExerPOO2b caneta1 = new ExerPOO2b();
        caneta1.modelo = "bic cristal";
        caneta1.cor = "azul";
        // caneta1.ponta = 0.5f;
        caneta1.carga = 80;
        // caneta1.tampada = true;
        // caneta1.rabiscar();
        caneta1.tampar();
        caneta1.status();
        
        System.out.println();
        ExerPOO2b caneta2 = new ExerPOO2b();
        caneta2.status();
    }
}
