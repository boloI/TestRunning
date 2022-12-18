package Inheritance;

public class main {
    public static void main(String[] args) {

        Teacher t=new Teacher();
        t.setName("Ionel");
        t.setEmail("ionel@nustim.com");
        t.Subject();

        PrivateTeacher pv= new PrivateTeacher();
        pv.setName("Private");
        pv.setEmail("private@private.com");

        PublicTeacher pt= new PublicTeacher();
        pt.setName("Public");
        pt.setEmail("public@sdasd.com");

        Student s= new Student();
        s.setName("Ionut");
        s.setEmail("ion@gmail.com");
        s.Grades();
        s.Clases();




        System.out.println("Student:  " + s.name + " "+s.email +", Grades: " + s.grades + ", Clases: " +s.clases);
        System.out.println("Teacher:  " + t.name + " "+t.email +" ," + "teaching " + t.subject);
        System.out.println("PrivateTeacher:  " + pv.name + " "+pv.email +" ," + "teaching " + pv.subject +
                ", students: " + pv.students);
        System.out.println("PublicTeacher:  " + pt.name + " "+pt.email +" ," + " School: " + pt.School);



    }
}
