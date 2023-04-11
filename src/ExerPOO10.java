import java.rmi.dgc.VMID;

public class ExerPOO10 {
    public static void main(String[] args) {
        ExP10Video v[] = new ExP10Video[3];
        v[0] = new ExP10Video("Aula 1");
        v[1] = new ExP10Video("Aula 2");
        v[2] = new ExP10Video("Aula 3");
        // System.out.println(v[0].toString()); 
        // System.out.println(v[1].toString()); 
        // System.out.println(v[2].toString()); 
        
        ExP10Gafanhoto g[] = new ExP10Gafanhoto[2];
        g[0] = new ExP10Gafanhoto("João", 20, "M", "joaozin");
        g[1] = new ExP10Gafanhoto("Maria", 25, "F", "marie_98");
        // System.out.println(g[0].toString()); 
        // System.out.println(g[1].toString()); 
        
        ExP10Visualizador u[] = new ExP10Visualizador[3];
        u[0] = new ExP10Visualizador(g[0], v[0]);
        u[0].avaliar();
        System.out.println(u[0].toString());

        u[1] = new ExP10Visualizador(g[0], v[1]);
        u[1].avaliar(87.0f);
        System.out.println(u[1].toString());
    }
}
