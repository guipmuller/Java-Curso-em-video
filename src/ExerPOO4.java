public class ExerPOO4 {
    public static void main(String[] args) {
        ExP4Conta conta1 = new ExP4Conta(0, false);
        conta1.setNumConta(123465);
        conta1.setNomeDono("Jubileu");
        conta1.abrirConta("CC");
        conta1.depositar(300);
        ExP4Conta conta2 = new ExP4Conta(0, false);
        conta2.setNumConta(456789);
        conta2.setNomeDono("Creuza");
        conta2.abrirConta("CP");
        conta2.depositar(500);
        conta2.sacar(300);
        conta2.sacar(1000);
        conta1.sacar(350);
        conta1.fecharConta();
        conta1.estadoAtual();
        conta2.estadoAtual();

        
    }
}
