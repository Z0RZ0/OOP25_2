import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Person {
    private final String name, surname;
    private final LocalDate birth;
    private final Set<Person> children;

    public Person(String name, String surname, LocalDate birth) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.children = new HashSet<>();
    }

    public Boolean adopt(Person child){
        if (child == this){
            return false;
        }
        children.contains(child);
        return children.add(child);
    }

    public Person getYoungestChild(){
        if(children.isEmpty())
            return null;

        Person youngest = null;

        for(Person child: children){
            if(youngest==null || child.birth.isAfter(youngest.birth)){
                youngest=child;
            }
        }
        return youngest;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birth=" + birth + '\'' +
                ", children=" + children +
                '}';
    }
}
