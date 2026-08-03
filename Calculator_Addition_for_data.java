class calculation{
    public int add(int a,int b){
        int r = a + b;
        System.out.print("The addition of "+ a +" , "+ b + " is : " ); 
        return r;
    
    }
}
public class Calculator_Addition_for_data {
    public static void main(String [] args){
        // int a =5;
        // int b=4;
        calculation calc = new calculation();
        int result= calc.add(4,5);
        System.out.println(result);
       
    }
}

