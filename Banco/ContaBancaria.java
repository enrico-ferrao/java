

public class ContaBancaria {
    private String titular;
    private String numero;
    private double saldo= 0;


    public ContaBancaria (String titular, String numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        if (saldo >= 0){
            this.saldo = saldo;
        }
    }

    public void depositar(double valor){
        if (valor > 0){
        System.out.printf("%s esta depositando R$ %f \n", titular, valor);
        this.saldo = saldo + valor;
        }
    }

    public void sacar(double valor){
            if (valor <= saldo){
        System.out.printf("%s esta sacando R$ %f \n", titular, valor);
        this.saldo = saldo - valor;
        }
        else {
            System.out.printf("A conta %s, nao possui o valor! \n", numero);
        }
    }

    public void transferir(ContaBancaria destino, double valor){
        if (valor <= saldo){
            this.saldo = saldo - valor;
            System.out.printf("%s esta transferindo para %s, o valor de: R$ %f \n", titular,destino,valor);
            destino.saldo += valor;
        }
        else {
            System.out.printf("A conta %s, nao possui esse saldo", numero);
        }
    }

    public void consultarSaldo(){
        System.out.printf("O %s, possui em sua conta R$ %f \n", titular, saldo);
    }

    public void exibirExtrato(){
        System.out.printf("----Extrato---- \n Titular: %s \n Conta: %s \n Saldo: %f \n ------------ \n", titular, numero, saldo);
    }
}
