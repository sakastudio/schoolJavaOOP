package Chapter4;

public class Confirm10Q1 {
  public static void main(String[] args){
    Confirm10Q1 ins = new Confirm10Q1();
    System.out.println("渡した数値[100]の倍数は"+ins.duplicate(100));
  }
  
  public int duplicate(int num){
    return num*2;
  }
}
