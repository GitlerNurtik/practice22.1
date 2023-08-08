public class Main {
    public static void main(String[] args) {
    School school = new School(81,"School",lesson.English);
    Student student = new Student(0,"Джейсон", "Джейсон", 18,Course.PYTHON);
    Student student1 = new Student(1,"Смит", "Смит", 21,Course.HTML);
    Student[] students = new Student[]{student,student1};
        for (Student value : students) {
            System.out.println(value);
        }
    }
}