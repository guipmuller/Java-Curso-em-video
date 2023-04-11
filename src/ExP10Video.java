public class ExP10Video implements ExP10AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int visualizacoes;
    private int curtidas;
    private boolean reproduzindo;
    
    public ExP10Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.visualizacoes = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    @Override
    public String toString() {
        return  "ExP10Video [   titulo= " + titulo + 
                            ", \navaliacao= " + avaliacao + 
                            ", \nvisualizacoes= " + visualizacoes + 
                            ", \ncurtidas= " + curtidas + 
                            ", \nreproduzindo= " + reproduzindo + "]";
    }

    @Override
    public void like() {
        this.setCurtidas(getCurtidas() + 1);        
    }
    @Override
    public void pause() {
        this.setReproduzindo(false);        
    }
    @Override
    public void play() {
        this.setReproduzindo(true);
        
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avalia) {
        // int nova;
        // nova = (int) ((this.avaliacao + avalia) / this.views);
        // this.avaliacao = nova;
        this.avaliacao = avalia;
    }
    public int getVisualizacoes() {
        return visualizacoes;
    }
    public void setVisualizacoes(int visualizacoes) {
        this.visualizacoes = visualizacoes;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    
}
