public class Veiculo {
  private String modelo;
  private String placa;
  private double nivelCombustivel;

  public Veiculo(String modelo, String placa){
    this.modelo = modelo;
    this.placa = placa; 
  }

  public void acelerar(){
    System.out.printf("%s acelerando\n", modelo);
  }

  public void abastecer(){
    System.out.printf("%s abastecendo\n", modelo);
  }

}