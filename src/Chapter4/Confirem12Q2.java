package Chapter4;

import java.util.Random;
public class Confirem12Q2 {
  public int[] distribution = new int[10];
  public static void main(String[] args){
    
    Confirem12Q2 inst1 = new Confirem12Q2();
    Confirem12Q2 inst2 = new Confirem12Q2();
    
    inst1.randomNum();
    inst2.randomNum();
    
    int[] total = new int[10];
    
    for(int i = 0;i<10;i++){
      total[inst1.distribution[i]] += 1;
      total[inst2.distribution[i]] += 1;
    }
        
    for(int i = 0;i<10;i++){
      System.out.println("["+i+"]���o����:"+total[i]); 
    }
  }
  
  public void randomNum(){
    Random random = new Random();
    for(int i = 0;i<10;i++){
      distribution[i] = random.nextInt(10);
    }
  }
}
