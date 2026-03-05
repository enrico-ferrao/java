package br.maua;
public class Personagem {
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;
    int vida = 10;
    
    //método: tipo de retorno, nome, lista de parâmetros e corpo
    

   

    void cacar(){
        if(vida==0){
            System.out.println("voce morreu!");
        }
        else {

            if (energia < 1 || fome == 10){
                vida--;
            }
            if(energia >= 2){
                System.out.println(nome + " caçando...");
                energia = energia - 2;
            }else{
                System.out.printf("%s sem energia para caçar...\n", nome);
            }
            if(fome < 10)
                fome = fome + 1;
            if(sono < 10)
                sono = sono + 1;
        }
    }

    void comer(){
        if(vida==0){
            System.out.println("voce morreu!");
        }
        else {
            if (energia < 1 || fome == 10){
                vida--;
            }
            if(fome >= 1){
                System.out.printf("%s comendo...\n", nome);
                // fome = fome - 1;
                // fome -= 1;
                fome--;
                if(energia < 10)
                    energia++;
                if(vida < 10)
                    vida++;
            }
            else{
                System.out.printf("%s sem fome\n", nome);   
            }
        }
    }


    void dormir(){
        if(vida==0){
                System.out.println("voce morreu!");
        }
        else {
            if (energia < 1 || fome == 10){
                vida--;
            }
            if(sono >= 1){
                System.out.printf("%s dormindo...\n", nome);
                --sono;
                energia = Math.min(energia + 1, 10);
            }
            else{
                System.out.printf("%s sem sono\n", nome);
            }
        }
    }
    
    
}
