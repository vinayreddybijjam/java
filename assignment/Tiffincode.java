import java.io.*;
import java.util.*;
import java.util.Collection;

class Tiffincode{
    public int hungryChildrens(int input1,int[] input2,int[] input3){
        Queue q=new LinkedList<>();
        Stack s=new Stack<>();
        for(int i=0;i<input3.length;i++){
            q.add(input3[i]);
            s.push(input2[input2.length-i-1]);
        }
        int c=0;
        while(!q.isEmpty() && c<q.size()){
            if(q.peek()==s.peek()){
                q.remove();
                s.pop();
                c=0;            
            }
            else{
                c++;
                q.add(q.remove());
            }
        }
        return q.size();
    }
}