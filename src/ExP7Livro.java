public class ExP7Livro implements ExP7Publicacao {
    private String titulo;
    private String autor;
    private int totPags;
    private int pagAtual;
    private boolean aberto;
    private ExP7Pessoa leitor;
    
    public String detalhes() {
        return          "=========================" +
                        ", \ntitulo = " + titulo + 
                        ", \nautor = " + autor + 
                        ", \ntotPags = " + totPags + 
                        ", \npagAtual = " + pagAtual+ 
                        ", \naberto = " + aberto + 
                        ", \nleitor = " + leitor.getNome() +
                        ", \nidade = " + leitor.getIdade();
    }
    public ExP7Livro(String titulo, String autor, int totPags, ExP7Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPags = totPags;
        this.leitor = leitor;
        this.pagAtual = 0;
        this.aberto = false;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotPags() {
        return totPags;
    }
    public void setTotPags(int totPags) {
        this.totPags = totPags;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public ExP7Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(ExP7Pessoa leitor) {
        this.leitor = leitor;
    }
    @Override
    public void abrir() {
            this.setAberto(true);
    }
    @Override
    public void avancarPag() {
        if (getAberto() && getPagAtual() < this.totPags) {
            this.setPagAtual(this.getPagAtual()+1);        
        } else {
            System.out.println("Erro ao avançar");
        }
    }
    @Override
    public void fechar() {
            this.setAberto(false);
    }
    @Override
    public void folhear(int pagina) {
        if (getAberto() && pagina > 0 && pagina <= getTotPags()) {
            this.setPagAtual(pagina);
        } else {
            System.out.println("Erro ao folhear");
        }
    }
    @Override
    public void voltarPag() {
        if (getAberto() && getPagAtual() > 1) {
            this.setPagAtual(this.getPagAtual()-1);        
        } else {
            System.out.println("Erro ao voltar");
        }
    }
}    