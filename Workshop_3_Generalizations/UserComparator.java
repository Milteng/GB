package gb.seminar_4;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T>{

    @Override
    public int compare(T arg0, T arg1) {
        String name0 = arg0.getSurname() + arg0.getName() + arg0.getFathername();
        String name1 = arg1.getSurname() + arg1.getName() + arg1.getFathername();
        return name0.compareToIgnoreCase(name1);        
    }
    
}
