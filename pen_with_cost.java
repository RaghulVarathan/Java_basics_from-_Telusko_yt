public class pen_with_cost {
    public static void main(String [] args){
    int money = 10;
    pen a = new pen();
    String Result = a.getPenCost(money);
    System.out.println(Result);
    int remaining = a.Change(money);
    System.out.println(remaining);
    }
}
class pen{

    public String getPenCost(int money){
        if(money >= 10) 
            return "Here is your pen";
        return "Need more money to buy";
    }
    public int Change(int money){
        System.out.print("Your Change is : ");
        return money-10;
    }
}