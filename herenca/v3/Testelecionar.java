public class Testelecionar {
    public static void main(String[] args) {
        professorPesquisador pp = new professorPesquisador();
        pp.setNome("José");
        System.out.println(pp.getNome());
        pp.lecionar();
    }
}
