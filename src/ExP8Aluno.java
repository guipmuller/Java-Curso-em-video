public class ExP8Aluno extends ExP8Pessoa {
    private int matr;
    private String curso;

    public void pagarMensalidade() {
        System.out.println("Pagando...");        
    }

    // @override
    // public void fazerAniv() {    
    // }

    public int getMatr() {
        return matr;
    }

    public void setMatr(boolean matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
