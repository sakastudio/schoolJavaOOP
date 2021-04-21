package Chapter3;

public class Confirem05Q2 {
  public static void main(String[] args){
    int[] array = {100,200,0,0};
    
    array[2] = array[0] + array[1];
    array[3] = array[1] * 2;
    
    System.out.println(array[0]);
    System.out.println(array[1]);
    System.out.println(array[2]);
    System.out.println(array[3]);
  }
}
