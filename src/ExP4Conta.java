public class ExP4Conta {
    public int numConta;
    protected String tipo; // cp = conta poupança ou cc = conta corrente
    private String nomeDono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("#####################");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Nome: " + this.getNomeDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        
    }

    public ExP4Conta(float saldo, boolean status) {
        this.saldo = 0;
        this.status = false;
    }
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "CC") {
            this.setSaldo(50);;
        } else if (tipo == "CP") {
            this.setSaldo(150);;
        }
    }
    public void fecharConta(){
        if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        } else if (this.getSaldo() > 0) {
            System.out.println("Conta com crédito");
        } else {
            System.out.println("Conta fechada com sucesso");
            setStatus(false);
        }
    }
    public void depositar(float valor){
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito de " + this.getNomeDono() + " realizado");
        } else {
            System.out.println("Operação inválida");
        }
    }
    public void sacar(float valor){
        if (this.getStatus() == true) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque no valor de " + valor);
            } else {
                System.out.println("Erro ao sacar");
            }
        } else {
            System.out.println("Conta inativa");
        }
    }
    public void pagarMensal(){
        float valor = 0;
        if (this.getTipo() == "CC") {
            valor = 12;
        } else if (this.getTipo() == "CP") {
            valor = 20;
        }
        if (this.getStatus() == true) {
            setSaldo(this.getSaldo - valor);
            System.out.println("Mensalidade paga");
        } else {
            System.out.println("Impossível pagar");
        }
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getNomeDono() {
        return nomeDono;
    }
    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
