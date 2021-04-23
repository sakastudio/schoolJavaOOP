package Chapter4;

public class Confirm08Q2 {
  public static void main(String[] args){
    Confirm08Q2 inst1 = new Confirm08Q2(),inst2 = new Confirm08Q2(),inst3 = new Confirm08Q2();
    
    inst1.morningGreet();
    inst2.daytimeGreet();
    inst3.nightGreet();
  }
  
  public void morningGreet(){
    System.out.println("おはようございます！");
  }
  public void daytimeGreet(){
    System.out.println("こんにちは！");
  }
  public void nightGreet(){
    System.out.println("こんばんは！");
  }
}
