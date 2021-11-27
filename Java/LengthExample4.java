public class LengthExample4 {
    public static void main(String[] args){
    String str="This is my name akanshu kumar";
    int sizeWithWhiteSpace=str.length();
    str=str.replace(" ", "");
    int sizeWithoutWhiteSpace=str.length();
    int noOfWhiteSpace=sizeWithWhiteSpace-sizeWithoutWhiteSpace;
    System.out.println(noOfWhiteSpace);

    }
}
