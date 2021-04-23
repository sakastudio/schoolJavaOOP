package Chapter3;

public class Confirm07Q9 {
  public static void main(String[] args){
    
    int[] score = {57,60,89,32,66,77,92,45};
    int max = score[0];
    int min = score[0];
    for(int n:score){
      if(max < n){
        max = n;
      }
      if(min > n){
        min = n;
      }
    }
    
    System.out.println(max);
    
    System.out.println(min);
  
  }
}
