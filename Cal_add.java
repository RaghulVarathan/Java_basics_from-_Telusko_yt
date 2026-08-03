class Addition{
    public int add(int a, int b){
        int r =a+b;
        System.out.println("Sum of two numbers is : "+ r);
        return r;
    }
    public void add(int a , int b, int c){
        int r = a+b+c;
        System.out.println("Sum of three number is : " + r);
    }
}
public class Cal_add{
    public static void main(String[] args){
        int n1 = 2;
        int n2 = 4;
        int n3= 6;
        Addition a = new Addition();
        a.add(n1,n2);
        a.add(n1, n2, n3);
    }
}