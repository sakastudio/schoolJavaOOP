package Chapter4;

public class Confirm12Q1 {
  public static void main(String[] args){
    
    
    VariableCheck inst1 = new VariableCheck();
    VariableCheck inst2 = new VariableCheck();
    
    for(int i = 0;i<50;i++){
      inst1.plus();
      inst2.minus();
    }
    
    System.out.println("プラス側のクラス変数\t\t:"+inst1.classVariable);
    System.out.println("プラス側のインスタンス変数\t:"+inst1.instanceVariable);
    System.out.println("マイナス側のクラス変数\t\t:"+inst2.classVariable);
    System.out.println("マイナス側のインスタンス変数\t:"+inst2.instanceVariable);
  }
}
