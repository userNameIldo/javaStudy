package exam18;

public class B{
    public static void main(String[] args){

    try{
        findClass();
    }catch(ClassNotFoundException e){
        System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
     
   }
  }
    public static void findClass() throws ClassNotFoundException{
        Class checkclass = Class.forName("java.lang.String2");
    }
}
