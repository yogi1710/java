class Student{
        int roll_no;
        String name;
        int marks;
}
// Here we are storing the different types of data values in the array
// We are creating the array of type student
// actually to create a array fo type int, we use - int variable[] = new int[3];
// Similarly to create a array of type student we use - student variable[] = new student[4]

public class ObjectArray {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll_no = 42;
        s1.name = "Suhail";
        s1.marks = 97;

        Student s2 = new Student();
        s2.roll_no = 52;
        s2.name = "Venu";
        s2.marks = 88;

        Student s3 = new Student();
        s3.roll_no = 54;
        s3.name = "Madhan";
        s3.marks = 92;

        Student stu[] = new Student[3];
        stu[0] = s1;
        stu[1] = s2;
        stu[2] = s3;
        for(int i = 0;i<stu.length;i++){
            System.out.println("Roll Number"+" "+ stu[i].roll_no);
            System.out.println(stu[i].name +": "+ stu[i].marks);
            System.out.println();
        }
    }
}
