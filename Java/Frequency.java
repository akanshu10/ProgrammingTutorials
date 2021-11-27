public class Frequency {
    public static int removeRedundant(int ar[],int n){
        int ar1[]=new int[n];
        int ar2[]=new int[n];
        int visited=-1;
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(ar[i]==ar[j]){
                    ar1[j]=visited;
                }
            }
            if(ar1[i]!=visited){
                ar2[k]=ar[i];
                k++;
            }
        }
        for(int i=0;i<k;i++){
            ar[i]=ar2[i];
        }
        return k;

    }
    public static void main(String[] args){
        int[] arr={1,2,3,3,2,2,4,4,2,2,1,4,5,8,4,2,7,3,2,7,2,6,2};
        int[] arr1=new int[arr.length];
        int visited=-1;
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr1[j]=visited;
                }
            }
            if(arr1[i]!=visited){
                arr1[i]=count;
            }
            
    }
    System.out.println("............................");
            System.out.println("Element|Frequency");
            System.out.println("............................");
            for(int k=0;k<arr1.length;k++){
                if(arr1[k]!=visited){
                    System.out.println(" "+arr[k]+" | "+arr1[k]);
                }
            }
            System.out.println("................");

            int len=arr.length;
            len=removeRedundant(arr, len);
            for(int i=0;i<len;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println("");
        }
    

}
