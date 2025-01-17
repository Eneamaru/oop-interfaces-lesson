package Homework_2.src.main.java.ru.gb.lessons.interfaces.core.clients.wild;

import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.clients.Animal;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.clients.owners.Owner;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.clients.supports.Record;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 Абстракция дикого животного
 */
public class WildAnimal extends Animal {
    public WildAnimal() {
    }

    private WildAnimal(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner, List<Record> records) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    public WildAnimal(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        this.id = id;
        this.name = null;
        this.numberOfLimbs = numberOfLimbs;
        this.registrationDate = registrationDate;
        this.owner = owner;
        this.records = new ArrayList<>();
    }

}
