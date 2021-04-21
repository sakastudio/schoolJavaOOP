package Chapter4;

public class Confirem11Q1 {
  public static void main(String[] args){
    CalcNomal calcNomal = new CalcNomal();
    System.out.println("Nomal�̉��Z���ʁF"+calcNomal.add(100,50)); 
    System.out.println("Static�̉��Z���ʁF"+CalcStatic.add(100,50)); 
    System.out.println("Nomal�̌��Z���ʁF"+calcNomal.substract(100,50)); 
    System.out.println("Static�̌��Z���ʁF"+CalcStatic.substract(100,50)); 
  }
}
