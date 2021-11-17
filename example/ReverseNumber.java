public class ReverseNumber {
    public static void main(strings[] arge){
        int number=987,reverse=0;
        while(number!=0){
            int remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
        System.out.println("the reverse of given number"+reverse);
    }
    
}
