public class RemoveDuplicateInArray {
    public static int removeElement(int arr[],int n){
        if(n==0||n==1)
        return n;
        int temp[]=new int [n];
        int j=0;
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for(int k=i+1;k<n;k++){
                if(arr[i]!=arr[k]){
                    flag=true;
                }
                else{
                    flag=false;
                    break;
                }
        }
        if(flag){
            temp[j]=arr[i];
                j++;
        }
    }
        temp[j++]=arr[n-1];
        for(int i=0;i<j;i++){
            arr[i]=temp[i];
        }
        return j;
    }
    public static void main(String[] args){
        int a[]={1,2,3,4,5,3,5,3,2,5,3,5,6,3,2,5,1};
        int length1=a.length;
        length1=removeElement(a, length1);
        for(int i=0;i<length1;i++){
            System.out.print(a[i]+" ");
        }

    }
    
}
