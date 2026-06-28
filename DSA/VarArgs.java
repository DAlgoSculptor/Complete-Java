public class VarArgs{


    static int sum(int ...numbers){
        int total = 0;
        for(int num:numbers){
            total = total + num;
        }
        return total;
        
    }
    public static void main(String[] args) {

        System.out.println(sum(10));

        System.out.println(sum(10, 20, 30,40,50,60,70,80,90,100));
        
    }
}