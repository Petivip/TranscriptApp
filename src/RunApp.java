import java.util.ArrayList;
import java.util.Scanner;

public class RunApp {
    int i = 0;
    Boolean conf = true;

    public void display(ArrayList<Student> list) {

    while(conf)

    {
        Student student = new Student();
        Course course=new Course();
        Transcript transcript=new Transcript();
        Scanner key = new Scanner(System.in);

        System.out.println("Welcome to the transcript application.");
        System.out.println("Enter Student ID number: ");
        student.setId(key.nextLong());
        System.out.println("Enter Student 's first name: ");
        student.setFname(key.next());
        System.out.println("Enter Student 's last name: ");
        student.setLname(key.next());
        System.out.println("Enter course: ");
        course.setName(key.next());
        System.out.println("Enter credits:");
        course.setCredit(key.nextInt());
        System.out.println("Enter grade: ");
        transcript.setGrade(key.next());
        list.add(student);
        System.out.println("Another course?(y / n): ");
        String var=key.next();
        if (var.equalsIgnoreCase("n")){
            conf=false;
        }
    }
}
}
