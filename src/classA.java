class StudentReport
{

    void show(String name)
    {
        System.out.println("Student: " + name);
    }

    void show(String name, int age) 
    {
        System.out.println("Student: " + name + ", age: " + age);
    }

    void show(String name, int age, double mark) 
    {
        System.out.println("Student: " + name + ", age: " + age + ", mark: " + mark);
    }

    void show(String name, int age, double mark, String subject)
    {
        System.out.println("Student: " + name + ", age: " + age
                + ", mark: " + mark + ", subject: " + subject);
    }
}

public class classA 
{
    public static void main(String[] args) 
    {
        StudentReport report = new StudentReport();

        report.show("Asha");
        report.show("Asha", 16);
        report.show("Asha", 16, 92.5);
        report.show("Asha", 16, 92.5, "Java");
    }
}