public class Veiculo { 
    String carro;
    String cor;
    String placa;
    private int peso = 100;
    private int preco = 5000;
    private int roda = 40;
    private int gasolina = 10;
    private int motor = 10;

    //setters
    public void setPeso (int peso){
        if (peso >= 100 && peso <= 1000){
            this.peso = peso;
        }       
    }

    public void setPreco (int preco){
        if (preco >= 50000 && preco <= 200000){ 
            this.preco = preco;
        }
    }
    
    public void setRoda (int roda) {
        if (roda >= 30 && roda <= 40){ 
            this.roda = roda;
    }
    }
    public void setGasolina (int gasolina) {
        if (gasolina >= 10 && gasolina <= 40){ 
            this.gasolina = gasolina;
    }
    }
    public void setMotor (int motor) {
        if (motor >= 0 && motor <= 10){ 
            this.motor = motor;
        }
    }
    


    void correr(){
    if(motor==0){
        System.out.println ("Problemas com veiculo!");
    }
    else {
        if (roda < 10 || gasolina < 1) {
            motor--;
        }
        if (roda > 2  && gasolina > 1){
            System.out.println (carro + "correndo...");
            roda = roda - 2;
            gasolina = gasolina - 1;
        }
        else{
            System.out.println("%s sem requisitos minimos para correr... \n", carro);
        }
        }
    }

    void concertar(){
        if (roda < 10 || gasolina < 1) {
            motor--;
        }
        else{
            if (motor < 10) {
                System.out.println("%s esta sendo concertado... \n", carro);
                motor++;
            }
            if (gasolina < 10) {
                System.out.println("%s esta abastacendo... \n", carro);
                gasolina++;
            }
            if (roda < 40) {
                System.out.println("%s esta trocando as rodas... \n", carro);
                if (roda + 10 <= 40){
                    roda = roda + 10;
                }
                }
                else{
                    roda = 40;
            }
            }

        }
}




