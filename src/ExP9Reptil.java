public class ExP9Reptil extends ExP9Animal{
    private String corEscama;

    @Override
    public void alimentar() {
        System.out.println("Comendo");
        
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de reptil");
        
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
        
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
