import java.util.Date;
import java.util.Locale;
import java.awt.*;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Date relogio = new Date();
        System.out.println("A hora do sistema é " + relogio.toString());
        Locale linguagem = Locale.getDefault();
        System.out.println("A linguagem do sistema é " + linguagem);
        System.out.println("A linguagem do sistema é " + linguagem.getDisplayLanguage());
        System.out.println("A linguagem do sistema é " + linguagem.getLanguage());
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int)size.getWidth();
        int altura = (int)size.getHeight();
        System.out.println("A resolução da tela é " + largura + " X " + altura);
    }
}
