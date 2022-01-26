package exam1;

public class NameExample{
    public static void main(String[] args){
            Name checkName = new Name();
            boolean check = checkName.nameCheck("배수");
            if(check){
                 System.out.println("당신은 배수지가 맞습니다.");
            }else{
                 System.out.println("당신은 배수지가 아닙니다.");                
            }
    }      
}