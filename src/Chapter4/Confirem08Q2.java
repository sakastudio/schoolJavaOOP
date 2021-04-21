package Chapter4;

public class Confirem08Q2 {
  public static void main(String[] args){
    Confirem08Q2 inst1 = new Confirem08Q2(),inst2 = new Confirem08Q2(),inst3 = new Confirem08Q2();
    
    inst1.morningGreet();
    inst2.daytimeGreet();
    inst3.nightGreet();
  }
  
  public void morningGreet(){
    System.out.println("���͂悤�������܂��I");
  }
  public void daytimeGreet(){
    System.out.println("����ɂ��́I");
  }
  public void nightGreet(){
    System.out.println("����΂�́I");
  }
}
