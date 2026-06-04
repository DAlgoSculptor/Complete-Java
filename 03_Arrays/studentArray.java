package JavaResources;
public class studentArray {
    public static void main(String[] args){

        Student s1 = new Student();
        s1.name="Danish";
        s1.marks=88;
        s1.rollno=1;

        Student s2 = new Student();
        s2.name="nawaz";
        s2.marks=80;
        s2.rollno=3;

        Student s3 = new Student();
        s3.name="Kelvin";
        s3.marks=90;
        s3.rollno=3;

        Student students[]= new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        
        // for(int i=0; i<students.length; i++){
        //     System.out.println(students[i].name + " : " + students[i].marks + " : " + students[i].rollno);
        // }

        for(Student stud:students){
            System.out.println(stud.name + ":" + stud.marks + ":" + stud.rollno);
        }


    }
}



class Student{
    int rollno;
    String name;
    int marks;
}
