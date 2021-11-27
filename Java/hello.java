class hello{
    public static void main(String  args[]){
        System.out.println("Hello akanshu");
        System.out.println("my name is akanshu kumar");
        String s=" ";
        if(s.isEmpty()){
            System.out.println(0);
        }
        else{
            int count=1;
            for (int i=0;i<s.length();i++){
                if(s.charAt(i)==' '){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}