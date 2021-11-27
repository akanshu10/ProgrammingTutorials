public class CountingExample1 {
    public static void main(String[] args){
        int vowel=5, consonet=21;
        int count=0;
        for(int i=0;i<vowel;i++){
            for(int j=0;j<consonet;j++){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
