public class ExP8Funcionario extends ExP8Pessoa {
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(String novoTrabalho) {
        this.setSetor(novoTrabalho);
    }

    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public boolean getTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    
}
