public class Student {
    private String name;
    private String regNo;
    public Student(String name, String regNo)
    {
        this.name = name;
        this.regNo = regNo;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setRegNo(String regNo){
        this.regNo = regNo;
    }
    public String getRegNo()
    {
        return regNo;
    }
}
