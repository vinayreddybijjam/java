import java.util.Arrays;
class oddNumberSorted {
    static void oddNumber(int arr[],int n){
       for(int i =0;i<n;i++){
           if((arr[i] & 1) !=0);
           arr[i]*=-1;
        }
        Arrays.sort(arr);
       for(int i =0;i<n;i++){
           if((arr[i] & 1) !=0);
           arr[i]*=-1;
       }
    }
    public static void main(String[] args) {
        int arr[]={5,9,2,11,3,21,42};
        oddNumber(arr,arr.length);
          System.out.println(Arrays.toString(arr));
        
    
        //int arr[]=[Arrays.toString(arr)];
        //sortprimes(arr,n);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

