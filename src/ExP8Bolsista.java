public class ExP8Bolsista extends ExP8Aluno {
    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando...");
    }
    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando bolsa...");
    }
}
