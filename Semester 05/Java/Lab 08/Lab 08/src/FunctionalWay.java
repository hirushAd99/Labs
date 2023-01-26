import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalWay {
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
        List<String> upperCaseName =  students.stream().map(student -> student.getName().toUpperCase()).sorted().collect(Collectors.toList());
        System.out.println("Sorted name List : ");
        System.out.println(upperCaseName );
    }

    public static void print2019Students(List<Student> students)
    {
        List<String> studentReg = students.stream().map(student -> student.getRegNo()).filter(regNo->regNo.startsWith("2019")).collect(Collectors.toList());

        System.out.println(studentReg);
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Hirusha" , "2019E166"));
        studentList.add(new Student("Adithya" , "2019E203"));
        studentList.add(new Student("John" , "2018E153"));
        studentList.add(new Student("Kamal" , "2017E243"));
        addSampleData(studentList);
        printName(studentList);
        print2019Students(studentList);
    }




}
