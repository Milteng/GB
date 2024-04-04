package gb;

import java.sql.SQLOutput;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        TrainingStream trainingStream = new TrainingStream();
        trainingStream.addStudyGroup(new StudyGroup("R-14", 28, "Математика"));
        trainingStream.addStudyGroup(new StudyGroup("R-15", 23, "Физика"));
        trainingStream.addStudyGroup(new StudyGroup("R-16", 18, "История"));
        trainingStream.addStudyGroup(new StudyGroup("R-17", 26, "Химия"));
        trainingStream.addStudyGroup(new StudyGroup("R-18", 22, "Геометрия"));

        //выведем как есть
        System.out.println("До сортировки------------------------\n");

        for (StudyGroup item : trainingStream){
            System.out.println(item.toString());
        }

        //отсортируем 1 методом
        trainingStream.Sort1();


        Iterator<StudyGroup> iterator = trainingStream.iterator();
        System.out.println("\nПосле сортировки------------------------\n");
        while (iterator.hasNext()){
            StudyGroup sg = iterator.next();
            System.out.println(sg.toString());
        }

        trainingStream.Clear();
        trainingStream.addStudyGroup(new StudyGroup("К-14", 13, "География"));
        trainingStream.addStudyGroup(new StudyGroup("К-15", 12, "Инженерная графика"));
        trainingStream.addStudyGroup(new StudyGroup("К-16", 34, "Биология"));
        trainingStream.addStudyGroup(new StudyGroup("К-17", 16, "Анатомия"));
        trainingStream.addStudyGroup(new StudyGroup("К-18", 18, "Компьютерная графика"));
        System.out.println("\n-----------------------------------------------------------------------------------------\n");
        System.out.println("\nДо сортировки------------------------\n");
        for (StudyGroup item : trainingStream){
            System.out.println(item.toString());
        }

        //отсортируем 2 методом
        trainingStream.Sort2();


        iterator = trainingStream.iterator();
        System.out.println("\nПосле сортировки------------------------\n");
        while (iterator.hasNext()){
            StudyGroup sg = iterator.next();
            System.out.println(sg.toString());
        }

    }
}
