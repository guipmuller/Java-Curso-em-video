public class ExerPOO7 {
    public static void main(String[] args) {
        ExP7Pessoa p = new ExP7Pessoa("Fulano", 30, 'm');
        ExP7Livro l = new ExP7Livro("O Conto", "Silva da Silva", 3, p);
        System.out.println(l.detalhes());
        l.abrir();
        l.avancarPag();
        l.folhear(30);
        System.out.println(l.detalhes());
    }
}
