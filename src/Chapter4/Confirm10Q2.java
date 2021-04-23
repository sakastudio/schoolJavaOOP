package Chapter4;

public class Confirm10Q2 {
  public static void main(String[] args){
    Confirm10Q2 ins1 = new Confirm10Q2();
    System.out.println("渡した数値[100]の倍数は"+ins1.duplicate(100));
    Confirm10Q2 ins2 = new Confirm10Q2();
    System.out.println("渡した数値[100]の3倍の数は"+ins2.triplicate(100));
  }
  
  public int duplicate(int num){
    return num*2;
  }
  public int triplicate(int num){
    return num*3;
  }
}
