import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(
                "Andrzej", "Kowalski",
                LocalDate.of(1980,1,1)
                ));

        personList.add(new Person(
                "Kuba", "Nowak",
                LocalDate.of(2000,10,13)
        ));

        personList.add(new Person(
                "Ania", "Kowalska",
                LocalDate.of(2017,3,20)
        ));

        System.out.println(personList.get(0).adopt(personList.get(1)));
        System.out.println(personList.get(0).adopt(personList.get(1)));
        System.out.println(personList.get(0).adopt(personList.get(2)));
        System.out.println(personList.get(0).adopt(personList.get(0)));

        for (Person p : personList){
            System.out.println(p);
        }

        System.out.println(personList.get(2).getYoungestChild());
        System.out.println(personList.get(0).getYoungestChild());

    }
}