package Chapter4;

public class Confirem10Q2 {
  public static void main(String[] args){
    Confirem10Q2 ins1 = new Confirem10Q2();
    System.out.println("�n�������l[100]�̔{����"+ins1.duplicate(100));
    Confirem10Q2 ins2 = new Confirem10Q2();
    System.out.println("�n�������l[100]�̂R�{��"+ins2.triplicate(100));
  }
  
  public int duplicate(int num){
    return num*2;
  }
  public int triplicate(int num){
    return num*3;
  }
}
