public class ExP9Mamifero extends ExP9Animal {
    private String corPelo;

    @Override
    public void alimentar() {
        System.out.println("Mamando...");        
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som...");
        
    }

    @Override
    public void locomover() {
        System.out.println("Correndo...");
        
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
