public class status {
    public static void main(String[] args){

        Day[] day=Day.values();

        for(Day d:day){
            System.out.println(d + ":" + d.ordinal());
        }
        

    }
}

enum Day {
    Monday,
    Tuesday,
    wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
}



