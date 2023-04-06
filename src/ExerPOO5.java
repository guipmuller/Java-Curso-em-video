public class ExerPOO5 {
    public static void main(String[] args) {
        ExP5ControleRemoto c = new ExP5ControleRemoto(0, false, false);
        c.ligar();
        c.maisVolume();
        c.play();
        c.ligarMudo();
        c.abrirMenu();
        c.fecharMenu();
    }   
}
