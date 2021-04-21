package Chapter4;

public class Confirem12Q1 {
  public static void main(String[] args){
    
    
    VariableCheck inst1 = new VariableCheck();
    VariableCheck inst2 = new VariableCheck();
    
    for(int i = 0;i<50;i++){
      inst1.plus();
      inst2.minus();
    }
    
    System.out.println("�v���X���̃N���X�ϐ�\t\t�F"+inst1.classVariable); 
    System.out.println("�v���X���̃C���X�^���X�ϐ�\t�F"+inst1.instanceVariable); 
    System.out.println("�}�C�i�X���̃N���X�ϐ�\t\t�F"+inst2.classVariable); 
    System.out.println("�}�C�i�X���̃C���X�^���X�ϐ�\t�F"+inst2.instanceVariable); 
  }
}
