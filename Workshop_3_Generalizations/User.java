package gb.seminar_4;

public class User {
    private String name;

    private String surname;

    private String fathername;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getFathername() {
        return fathername;
    }

    public User(String name, String surname, String fathername){
        this.name = name;
        this.surname = surname;
        this.fathername = fathername;
    }

    @Override
    public String toString() {
        return "User{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", fathername='" + fathername + '\'' +
                '}';
    }
}
