package exam1;

public class NameExample{
    public static void main(String[] args){
            Name checkName = new Name();
            boolean check = checkName.nameCheck("���");
            if(check){
                 System.out.println("����� ������� �½��ϴ�.");
            }else{
                 System.out.println("����� ������� �ƴմϴ�.");                
            }
    }      
}