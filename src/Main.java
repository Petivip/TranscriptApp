import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> list=new ArrayList<>();
        RunApp runApp=new RunApp();
        runApp.display(list);
        for(Student student:list){
         System.out.println(student.getFname()+" "+student.getLname());
         System.out.println("Student id :"+ student.getId());
         System.out.println(student.course.getName()+" "+student.course.getCredit()+" "+ student.transcript.getGrade());
        }
    }

}
