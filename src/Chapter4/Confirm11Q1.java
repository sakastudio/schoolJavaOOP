package Chapter4;

public class Confirm11Q1 {
  public static void main(String[] args){
    CalcNomal calcNomal = new CalcNomal();
    System.out.println("Nomalの加算結果"+calcNomal.add(100,50));
    System.out.println("Staticの加算結果"+CalcStatic.add(100,50));
    System.out.println("Nomalの加算結果"+calcNomal.substract(100,50));
    System.out.println("Staticの加算結果"+CalcStatic.substract(100,50));
  }
}
