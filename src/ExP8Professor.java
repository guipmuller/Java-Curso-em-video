public class ExP8Professor extends ExP8Pessoa {
    private String especialidade;
    private float salario;

    public void receberAum(float aumento) {
        this.setSalario(aumento);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
