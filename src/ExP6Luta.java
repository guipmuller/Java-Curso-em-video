import java.util.Random;

public class ExP6Luta /* implements ExP6Controlador */ {
    private ExP6Lutador desafiante;
    private ExP6Lutador desafiado;
    private int rounds;
    private boolean aprovada;

    // public ExP6Luta(ExP6Lutador desafiante, ExP6Lutador desafiado, int rounds, boolean aprovada) {
    //     this.desafiante = desafiante;
    //     this.desafiado = desafiado;
    //     this.rounds = rounds;
    //     this.aprovada = aprovada;
    // }
    public ExP6Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(ExP6Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public ExP6Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(ExP6Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    //@Override
    public void lutar() {
        if (this.getAprovada()) {
            desafiado.apresentar();
            desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0: //empate
                System.out.println("----------");
                System.out.println("Começo da luta!");
                System.out.println("Resultado: Empate!");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;
                case 1: //ganhou desafiado
                    System.out.println("----------");
                    System.out.println("Começo da luta!");
                    System.out.println("Resultado: " + desafiado.getNome() + " venceu a luta");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                break;
                case 2: //ganhou desafiante
                    System.out.println("----------");
                    System.out.println("Começo da luta!");
                    System.out.println("Resultado: " + desafiante.getNome() + " venceu a luta");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                break;
            }
        } else {
            System.out.println("Luta não aprovada.");
        }
    }

    //@Override
    public void marcarLuta(ExP6Lutador lutador1, ExP6Lutador lutador2) {
        if (lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1 != lutador2) {
            this.setAprovada(true);
            this.setDesafiado(lutador1);
            this.setDesafiante(lutador2);
            System.out.println("Luta marcada");
        } else {
            System.out.println("Não foi possível marcar a luta");
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    
}
