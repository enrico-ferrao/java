public class Professor extends Pessoa {
    int matricula;

    public void lecionar() {
        System.out.printf("%s lecionando....\n", getnome());
    }
}