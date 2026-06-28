class counter{
    public int freq(int n){
        
        int count = 0;
        while(n>0){
            int last_digit= n % 10;
            if(last_digit==3){
                count++;
            }
            n = n / 10;
        }
        return count;

    }
}


public class FrequencyCount_6{
    public static void main(String[] args) {
        counter cot= new counter();
        int result= cot.freq(132345897);
        System.out.println(result);
    }
}