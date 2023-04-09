public class ExerPOO8 {
    public static void main(String[] args) {
        ExP8Aluno p2 = new ExP8Aluno();
        ExP8Professor p3 = new ExP8Professor();
        ExP8Funcionario p4 = new ExP8Funcionario();

        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
        p4.setSexo("F");
        p2.setIdade(18);

        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
