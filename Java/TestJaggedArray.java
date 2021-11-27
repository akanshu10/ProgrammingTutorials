public class TestJaggedArray {
    public static void main(String[] args){
        int[][] arr=new int [3][];
        arr[0]=new int [5];
        arr[1]=new int [3];
        arr[2]=new int [1];
        int count=0;
        Class c=arr.getClass();
        String name=c.getName();
        System.out.println(name);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=count++;
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
}
