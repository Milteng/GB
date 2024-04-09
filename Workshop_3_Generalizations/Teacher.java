package gb.seminar_4;

public class Teacher extends User{
    private Integer teacherId;

    public Teacher(Integer teacherId, String name, String surname, String fathername) {
        super(name, surname, fathername);
        this.teacherId=teacherId;
    }
    public Integer getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                "surname='" + super.getSurname() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", fathername='" + super.getFathername() + '\'' +
                '}';
    }
}
