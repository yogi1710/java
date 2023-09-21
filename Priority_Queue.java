//10. Java Priority Queue:     
import java.util.ArrayList;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.List;

 class Student { 
    String  Std_name;
    int     std_id;
    double  std_cgpa;
    public Student(int std_id, String Std_name, double std_cgpa) {
        this.Std_name   = Std_name;
        this.std_id = std_id
;
        this.std_cgpa = std_cgpa;
    }
 
    public String getStd_name() {
        return this.Std_name;
    }
     
    public int getstd_id() {
        return this.std_id;
    }
    
    public double getstd_cgpa() {
        return this.std_cgpa;
    }     
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.Std_name);
        sb.append(" " + this.std_cgpa);
        sb.append(" " + this.std_id);
        return sb.toString();
    }
}

class StudentComparator implements Comparator<Student> { 
    public int compare(Student s1, Student s2) { 
        int std_cgpaDiff = Double.compare(s2.getstd_cgpa(), s1.getstd_cgpa());
        if (std_cgpaDiff != 0)
            return std_cgpaDiff; 
        int Std_nameDiff = s1.getStd_name().compareTo(s2.getStd_name());
        if (Std_nameDiff != 0)
            return Std_nameDiff; 
        return Integer.compare(s1.getstd_id(), s2.getstd_id());
    } 
} 

class Priorities {
    public Priorities() {
    }
    public List<Student> takeStudent(List<String> variable) {
        List <Student> student_values   = new ArrayList<Student>();
        PriorityQueue<Student> pq     = new PriorityQueue<Student>(variable.size(), new StudentComparator());
        for (String e : variable) {                         
            if (e.startsWith("ENTER", 0)) {
                String[] fields = e.split(" ");
                Student student = new Student(Integer.parseInt(fields[3]), fields[1], Double.parseDouble(fields[2])); 
                pq.add(student);
            }
            else { 
                pq.poll();
            }   
        }
        int n = pq.size();
        for (int i = 0; i < n; i++) {
            Student student = pq.remove();
            student_values.add(student);
        }
        return student_values;
    }
}

public class Priority_Queue {
    private final static Scanner sc = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int sum = Integer.parseInt(sc.nextLine());    
        List<String> variable = new ArrayList<>();
        
        while (sum-- != 0) {
            String event = sc.nextLine();
            variable.add(event);
        }
        
        List<Student> student_values = priorities.takeStudent(variable);
        
        if (student_values.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: student_values) {
                System.out.println(st.getStd_name());
            }
        }
    }
}