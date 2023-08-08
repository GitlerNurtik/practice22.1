public class School {
    private int id;
    private String name;
    private lesson lesson;

    public lesson getLesson() {
        return lesson;
    }

    public void setLesson(lesson lesson) {
        this.lesson = lesson;
    }

    public School(int id, String name, lesson lesson) {
        this.id = id;
        this.name = name;
        this.lesson = lesson;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    School(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
