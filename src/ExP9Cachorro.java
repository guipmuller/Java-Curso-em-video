public class ExP9Cachorro extends ExP9Lobo {

    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }
    public void enterrarOsso() {
        System.out.println("Enterrando");
    }
    public void abanarRabo() {
        System.out.println("Abanando");
    }
    
    public void reagir(String frase){
        System.out.println("Cachorro obedece");
    }
    public void reagir(int hora, int min){
        System.out.println("Cachorro come");
    }
    public void reagir(boolean dono){
        System.out.println("Cachorro feliz");
    }
    public void reagir(int idade, float peso){
        System.out.println("Cachorro dormindo");
    }
}
