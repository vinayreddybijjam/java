import java.lang.*;
public class ex {
    void display(){
        try{
            int a=5/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
class Except{
    public static void main(String[] args) {
        ex obj=new ex();
        obj.display();
    }
}
