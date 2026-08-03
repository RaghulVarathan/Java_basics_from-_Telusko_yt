public class nested_for {
    public static void main(){
        int i =1;
        int j=1;
        for( i = 1;i<6;i++){
            System.out.println("Day:"+ i);
            for(j=1;j<9;j++){
                System.out.println("Hours spend on this: "+ j);
            }
        }
        System.out.println("Totally a man works "+ i +" Days a week and "+j+" hours a day");
    }
}
