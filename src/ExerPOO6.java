public class ExerPOO6 {
    public static void main(String[] args) {
        ExP6Lutador lutador[] = new ExP6Lutador[6];
        lutador[0] = new ExP6Lutador("Pretty boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
        lutador[1] = new ExP6Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        lutador[2] = new ExP6Lutador("Snapshadow", "Estados Unidos", 35, 1.65f, 80.9f, 12, 2, 1);
        lutador[3] = new ExP6Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        lutador[4] = new ExP6Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        lutador[5] = new ExP6Lutador("Nerdaard", "Estados Unidos", 30, 1.81f, 105.7f, 12, 2, 4);

        ExP6Luta UEC01 = new ExP6Luta();
        UEC01.marcarLuta(lutador[0], lutador[1]);
        UEC01.lutar();
        System.out.println("============> Resultados pós luta");
        lutador[0].status();
        lutador[1].status();
        ExP6Luta UEC02 = new ExP6Luta();
        UEC02.marcarLuta(lutador[2], lutador[3]);
        UEC02.lutar();
        System.out.println("============> Resultados pós luta");
        lutador[2].status();
        lutador[3].status();
    }
}
