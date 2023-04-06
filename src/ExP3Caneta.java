public class ExP3Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public ExP3Caneta(String modelo, float ponta, String cor, boolean tampada) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.tampada = tampada;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public float getPonta() {
        return ponta;
    }
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public boolean isTampada() {
        return tampada;
    }
    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    // public ExerPOO3b(String m, String c, float p){ // construtor
    //     this.modelo = m;
    //     this.cor = c;
    //     this.ponta = p;
    //     this.tampar();
    // }

    // public String getModelo(){
    //     return this.modelo;
    // }
    // public void setModelo(String m){
    //     this.modelo = m;
    // }
    // public float getPonta(){
    //     return this.ponta;
    // }
    // public void setPonta(float p){
    //     this.ponta = p;
    // }
    // public void tampar(){
    //     this.tampada = true;
    // }
    // public void destampar(){
    //     this.tampada = false;
    // }
    // public void status(){
    //     System.out.println("Sobre a caneta:");
    //     System.out.println("Modelo: " + this.getModelo());
    //     System.out.println("Ponta: " + this.getPonta());
    //     System.out.println("Cor: " + this.cor);
    //     System.out.println("Tampada: " + this.tampada);
    // }
}
