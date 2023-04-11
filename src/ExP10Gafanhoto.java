public class ExP10Gafanhoto extends ExP10Pessoa {
    private String login;
    private int totAssistido;
    
    public ExP10Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    
    @Override
    public String toString() {
        return "ExP10Gafanhoto [" + super.toString() + 
                "\nlogin= " + login + 
                ", \ntotAssistido= " + totAssistido + "]";
    }


    public void viuMaisUm() {
        this.setTotAssistido(getTotAssistido() + 1);
    }
    
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    
}
