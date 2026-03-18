public class Teste {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Enrico", "1001", 0);
        c1.depositar (50);
        c1.exibirExtrato();
        ContaBancaria c2 = new ContaBancaria ("Gabriel", "1002",0);
        c2.depositar(100);
        c2.transferir(c1, 100);
        c1.exibirExtrato();
        c2.exibirExtrato();
    }
}
