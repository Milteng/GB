package gb.seminar_4;

import java.util.List;

public class TeacherService implements UserService<Teacher>{

    private List<Teacher> teacherList;
    private Integer maxTeacherId = 0;
    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }

    @Override
    public void initData(List<Teacher> list) {
        this.teacherList = list;
        maxTeacherId = getNewMaxTeacherId();
    }

    @Override
    public void create(String name, String surname, String fathername) {
        Teacher teacher = new Teacher(++maxTeacherId,name,surname,fathername);
        teacherList.add(teacher);
    }
    public void editTeacher(Integer teacherId, String name, String surname, String fathername){
        for (Teacher teacher: teacherList) {
            if (teacher.getTeacherId().equals(teacherId)){
                teacher.setSurname(surname);
                teacher.setName(name);
                teacher.setFathername(fathername);
            }
        }
    }
    private Integer getNewMaxTeacherId(){
        Integer result = teacherList.get(0).getTeacherId();
        for (Teacher teacher: teacherList) {
            if (result < teacher.getTeacherId()){
                result = teacher.getTeacherId();
            }
        }
        return result;
    }
}
