public class DuplicateElement {
    public static void main(String[] args){
        int a[]={1,2,3,4,3,4,5,3,5,2};
        System.out.println("Print array");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("Duplicate");
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
    
}
