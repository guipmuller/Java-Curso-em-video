public class ExP10Visualizador {
    private ExP10Gafanhoto espectador;
    private ExP10Video filme;
    
    public ExP10Visualizador(ExP10Gafanhoto expectador, ExP10Video filme) {
        this.espectador = expectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setVisualizacoes(this.filme.getVisualizacoes() + 1);
    }
    
    @Override
    public String toString() {
        return "ExP10Visualizador [expectador=" + espectador + ", filme=" + filme + "]";
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    };
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    };
    public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20) {
            tot = 3;
        } else if (porc <= 50){
            tot = 5;
        } else if (porc <= 90){
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    };

    public ExP10Gafanhoto getEspectador() {
        return espectador;
    }
    public void setEspectador(ExP10Gafanhoto espectador) {
        this.espectador = espectador;
    }
    public ExP10Video getFilme() {
        return filme;
    }
    public void setFilme(ExP10Video filme) {
        this.filme = filme;
    }

    
}
