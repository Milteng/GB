package gb.seminar_4;

import java.util.List;

public class TeacherController implements UserController<Teacher>{

    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    @Override
    public void create(String name, String surname, String fathername) {
        teacherService.create(name,surname,fathername);
    }
    public void editTeacher(Integer teacherId, String name, String surname, String fathername){
        teacherService.editTeacher(teacherId,name,surname,fathername);
    }
    public void initTeacherList(List<Teacher> list){
        teacherService.initData(list);
    }
    public void printTeachers(){
        teacherView.sendOnConsole(teacherService.getAll());
    }
}
