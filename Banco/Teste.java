import java.util.Random;

public class Teste {

    public static void main(String[] args)  throws Exception {
        Random gerador = new Random();
        ContaBancaria c1 = new ContaBancaria("Enrico", "1001", 0);
        ContaBancaria c2 = new ContaBancaria ("Gabriel", "1002",0);
        while (true) {
            int oQueFazer = gerador.nextInt(1, 6);
            switch(oQueFazer){
                case 1:
                    c1.depositar(50);
                    break;
                case 2:
                    c1.sacar(50);
                    break;
                case 3:
                    c1.transferir(c2, 50);
                    break;
                case 4:
                    c1.consultarSaldo();
                    break;
                case 5:
                    c1.exibirExtrato();
            }
            System.out.println("======================");
            Thread.sleep(8000);
        }
       
    }
    
}

