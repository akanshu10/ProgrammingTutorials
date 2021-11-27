public class NumberToWord {
    static void numberToWord(char num[]){
        int len=num.length;
        if(len==0){
            System.out.println("String is Empty");
        }
        if(len>4){
            System.out.println("The given number has more than 4 digit :");
        }
        String[] oneDigit=new String[]{"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String[] twoDigit=new String[]{"","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String[] multipleOften=new String[]{"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String[] powerOftens=new String[]{"Hundred","Thousand"};
        System.out.println(String.valueOf(num)+" ");
        if(len==1){
            System.out.print(oneDigit[num[0]-'0']);

        }
        int x=0;
        while(x<num.length){
            if(len>=3){
                if(num[x]-'0'!=0){
                    System.out.print(oneDigit[num[x]-'0']+" ");
                    System.out.print(powerOftens[len-3]+" ");
                }
                --len;
            }
            else{
                if(num[x]-'0'==1){
                    int sum=num[x]-'0'+num[x+1]-'0';
                    System.out.print(twoDigit[sum]);
                }
                else if(num[x]-'0'==2&&num[x+1]-'0'==0){
                    System.out.print("Twenty");
                }
                else{
                    int i=(num[x]-'0');
                        if(i>0){
                            System.out.print(multipleOften[i]+ " ");
                        }
                        else{
                            System.out.print(" ");
                        }
                        ++x;
                        if(num[x]-'0'!=0){
                            System.out.print(oneDigit[num[x]-'0']);
                        }
                    }
                    ++x;
                }
            }
            
        }
    
    public static void main(String[] args){
        numberToWord("1111".toCharArray());

    }
    
}
