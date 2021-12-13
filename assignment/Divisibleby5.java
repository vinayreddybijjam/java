import java.util.*;
 class Divisibleby5{
    public static void main(String[] args) 
    {
        int n=5455;
       Scanner s= new Scanner(System.in);
        System.out.print("Enter any number:");
        n = s.nextInt();
        if(n % 5 == 0)
        {
            System.out.println(n+" is divisible by 5");
        }
        else
        {
            System.out.println(n+" is not divisible by 5");
        }
        //input.close();
    }
}