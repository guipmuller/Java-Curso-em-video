public abstract class ExP10Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiencia;

    public ExP10Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }
    

    @Override
    public String toString() {
        return "\nnome= " + nome + 
                ", \nidade= " + idade + 
                ", \nsexo= " + sexo + 
                ", \nexperiencia= " + experiencia;
    }


    protected void ganharExp() {
        this.setExperiencia(getExperiencia() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
