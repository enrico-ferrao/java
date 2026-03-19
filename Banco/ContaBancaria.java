

public class ContaBancaria {
    private String titular;
    private String numero;
    private double saldo= 0;


    ContaBancaria (String titular, String numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        if (saldo >= 0){
            this.saldo = saldo;
        }
    }

    public void depositar(double valor){
        if (valor > 0){
        System.out.printf("Operação: Depositar \n%s esta depositando R$ %f \n ------------ \n", titular, valor);
        this.saldo = saldo + valor;
        }
    }

    public void sacar(double valor){
            if (valor <= saldo){
        System.out.printf("Operação: Sacar \n %s esta sacando R$ %f \n ------------ \n", titular, valor);
        this.saldo = saldo - valor;
        }
        else {
            System.out.printf("A conta %s, nao possui o valor! \n", numero);
        }
    }

    public void transferir(ContaBancaria destino, double valor){
        if (valor <= saldo){
            this.saldo = saldo - valor;
            System.out.printf("Operação: Transferencia \n%s esta transferindo para %s, o valor de: R$ %f \n ------------ \n", titular,destino,valor);
            destino.saldo += valor;
        }
        else {
            System.out.printf("A conta %s, nao possui esse saldo", numero);
        }
    }

    public void consultarSaldo(){
        System.out.printf("Operação: Saldo \nA conta %s, titular: %s possui em sua conta R$ %f \n ------------ \n", numero, titular, saldo);
    }

    public void exibirExtrato(){
        System.out.printf("----Extrato---- \nTitular: %s \nConta: %s \nSaldo: %f \n ------------ \n", titular, numero, saldo);
    }
}
