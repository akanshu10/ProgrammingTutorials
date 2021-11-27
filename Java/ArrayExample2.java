public class ArrayExample2 {
    static void min(int ar[]){
        int min=ar[0];
        for(int i=1;i<ar.length;i++){
            if(min>ar[i]){
                min=ar[i];
            }
        }
        System.out.println(min);  
    }
    public static void main(String[] args){
        int a[]={14,24,31,24,53,62,74,38,49,10};
        System.out.println("Minimum number is :");
        min(a);

    }
    
}
