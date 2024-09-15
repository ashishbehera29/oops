public class students extends citizen {
     int rollno;
     int marks;
     String collegename;
     
    public students(String name, String gender, int age, int rollno, int marks, String collegename) {
        super(name, gender, age);
        this.rollno = rollno;
        this.marks = marks;
        this.collegename = collegename;
    }
     
}
