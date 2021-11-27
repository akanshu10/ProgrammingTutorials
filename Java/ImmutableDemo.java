public final class ImmutableDemo {
    final String pencardNumber;
    ImmutableDemo(String pencardNumber){
        this.pencardNumber=pencardNumber;
    }
    
    public String getPenNumber(){
        return pencardNumber;
    }
    public static void main(String[] args){
        ImmutableDemo i=new ImmutableDemo("ABDJD");
        System.out.println("PanCard "+i.getPenNumber());
    }
}
