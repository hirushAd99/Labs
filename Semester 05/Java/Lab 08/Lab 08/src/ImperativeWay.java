import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImperativeWay {
    public static void addSampleData(List<Student> students)
    {
        ArrayList sampleData = new ArrayList();
        for(Student student: students)
        {
            sampleData.add(student.getName());
        }
    }
    public static void printName(List<Student> students)
    {
        ArrayList upperCaseName = new ArrayList();
        for(Student student : students)
        {
            upperCaseName.add((student.getName()).toUpperCase());
        }
        Collections.sort(upperCaseName);
        System.out.println("Sorted name List : ");
        System.out.println(upperCaseName);
    }

    public static void print2019Students(List<Student> students)
    {
        String checkString = "2019";
        ArrayList students2019 = new ArrayList();
        for(Student student: students)
        {
            String regNum = student.getRegNo();
            String[] regNo = regNum.split("/");
            if(regNum.startsWith("2019"))
                students2019.add(regNum);
        }
        System.out.println(students2019);
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Hirusha" , "2019/E/166"));
        studentList.add(new Student("Adithya" , "2019/E/203"));
        studentList.add(new Student("John" , "2018/E/153"));
        studentList.add(new Student("Kamal" , "2017/E/243"));
        addSampleData(studentList);
        printName(studentList);
        print2019Students(studentList);
    }
}
