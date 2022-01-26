package exam18;

public class A{
    public static void main(String[] args){

    String data = "a123";   

    try{
        int num = Integer.parseInt(data);
        System.out.println("data");
    }catch(NumberFormatException e){
        System.out.println("숫자로 변환할 수 없습니다.");
     
   }finally{
        System.out.println("finally구문이 실행되었습니다.");
   }
    }
}
