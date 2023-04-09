public class ExP9Peixe extends ExP9Animal {
    private String corEscama;

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
        
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som");
        
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
        
    }

    public void soltarBolha() {
        System.out.println("Emitindo bolhas");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
