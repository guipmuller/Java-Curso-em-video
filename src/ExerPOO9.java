public class ExerPOO9 {
    
    public static void quebraLinha() {
        System.out.println("");
        System.out.println("_____________");
    }
    
    public static void main(String[] args) {
        ExP9Mamifero m = new ExP9Mamifero();
        ExP9Reptil r = new ExP9Reptil();
        ExP9Peixe p = new ExP9Peixe();
        ExP9Ave a = new ExP9Ave();
        ExP9Canguru k = new ExP9Canguru();
        ExP9Lobo l = new ExP9Lobo();
        ExP9Cachorro c = new ExP9Cachorro();
        
        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);

        quebraLinha();
        m.locomover();
        m.alimentar();
        m.emitirSom();

        quebraLinha();
        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();

        quebraLinha();
        a.setPeso(0.89f);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();

        quebraLinha();
        k.setPeso(55.3f);
        k.setIdade(3);
        k.setMembros(4);
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.usarBolsa();

        quebraLinha();
        l.emitirSom();

        quebraLinha();
        c.setPeso(3.94f);
        c.setIdade(5);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.abanarRabo();
        c.reagir("Oi rex");
        c.reagir(true);
        c.reagir(10, 10);
        c.reagir(10, 5.5f);

    }
}
