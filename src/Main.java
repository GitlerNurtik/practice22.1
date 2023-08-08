public class Main {
    public static void main(String[] args) {
    School school = new School(81,"School");
    Student student = new Student(0,"Джейсон", "Джейсон", 18);
    Student student1 = new Student(1,"Смит", "Смит", 21);
    Student[] students = new Student[]{student,student1};
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}