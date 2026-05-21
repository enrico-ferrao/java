import javax.swing.JOptionPane;

public class OperacoesVetores {
    static int [] numeros = new int [5];
    static int quantidade = 0;
    static  String menu = "1- Adicionar\n2- Exibir\n3- Buscar \n4- Ver o maior\n5- Somar\n6- Par \n0- Sair";
    public static void main(String[] args) {
        int opcao;
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcao) {
                case 1:
                    adicionar();
                    break;
                case 2:
                    exibir();
                    break;
                case 3:
                    buscar();
                    break;
                case 4:
                    verMaior();
                    break;
                case 5:
                    somar();
                    break;
                case 6:
                    par();
                    break;
                default:
                    break;
            }
        }while (opcao != 0);
    }
    static void adicionar(){

        if (quantidade == numeros.length){
            JOptionPane.showMessageDialog(null, "Vetor cheio! ");
            return;
        }
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Qual valor? "));
        numeros[quantidade] = valor;
        quantidade++;
        JOptionPane.showMessageDialog(null, "Valor adicionado com sucesso!");

    }


    static void exibir() {
        
        if (quantidade==0){
            JOptionPane.showMessageDialog(null, "Vetor vazio");
            return;
        }
        String texto = "";
        for (int i = 0; i < quantidade; i++ ){

            texto = texto + numeros[i] + " ";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    static void buscar(){

        if (quantidade == 0) {
            JOptionPane.showMessageDialog(null, "Vetor vazio");
            return;
        }
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Qual valor a ser buscado? "));
        for (int i = 0; i < quantidade; i++){
            if (valor == numeros[i]){
                JOptionPane.showMessageDialog(null, "Encontrado na posição: " + i);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Elemento não encontrado");

    }
    static void verMaior(){
        if (quantidade == 0) {
            JOptionPane.showMessageDialog(null, "Vetor vazio");
            return;
        }
        int maior = numeros[0];
        for(int i = 1; i < quantidade; i++){
            // operador ternário
            maior = numeros[i] > maior ? numeros[i] : maior;
        }
        JOptionPane.showMessageDialog(null, "Maior: "+ maior);
    }
    static void somar(){
         if (quantidade == 0) {
            JOptionPane.showMessageDialog(null, "Vetor vazio");
            return;
        }
        int soma = 0;
        for (int i = 0; i < quantidade; i++){
            soma = soma + numeros [i];
        }
        JOptionPane.showMessageDialog(null, "Soma dos numeros: " + soma );
    }
    static void par(){
        if (quantidade == 0) {
            JOptionPane.showMessageDialog(null, "Vetor vazio");
            return;
        }

        String numeroPar = "" ;
        for (int i = 0; i < quantidade; i++){
            if (numeros[i] % 2 == 0 ){
                numeroPar = numeroPar + numeros[i] + " ";
            }
        }
        JOptionPane.showMessageDialog(null, numeroPar);
    }
}

