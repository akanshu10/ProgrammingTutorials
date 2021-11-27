public class Rotateleft {
    public static void main(String[] args){
        int a[]={1,2,3,4,5};
        int n=66;
        int b[]=new int[n];
        System.out.println("Original Array :");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println("Array after rotation : ");
        for(int j=0;j<n;j++){
            int k,first;
            first=a[0];
            for(k=0;k<a.length-1;k++){
                a[k]=a[k+1];
            }
            a[k]=first;
        }
        System.out.println();
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+"  ");
        }
    }
    
}
