package exam18;

public class A{
    public static void main(String[] args){

    String data = "a123";   

    try{
        int num = Integer.parseInt(data);
        System.out.println("data");
    }catch(NumberFormatException e){
        System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
     
   }finally{
        System.out.println("finally������ ����Ǿ����ϴ�.");
   }
    }
}
