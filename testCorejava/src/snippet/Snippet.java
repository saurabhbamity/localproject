package snippet;

public class Snippet {
    public static  void main( String[] str){
       new  Snippet().A();
    }
    
    
    
    public void A()
    {
        System.out.println(setOne().toString());
        
    }
    protected StringBuilder setOne(){
        StringBuilder builder=new StringBuilder();
        try{
            builder.append("Cool");
            return builder.append("Return");
        }finally{
            builder.append("+1");
        }
    }
    
}

