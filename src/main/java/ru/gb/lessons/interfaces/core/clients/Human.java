package Homework_2.src.main.java.ru.gb.lessons.interfaces.core.clients;

/**
 Абстракция человека
 */
public class Human { // todo на семинаре, в учебных целях, сделать extends Animal
    private final String fullName;

    public Human(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
