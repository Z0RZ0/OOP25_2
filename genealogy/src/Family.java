import java.util.HashMap;
import java.util.Map;

public class Family {
    private final Map<String,Person> family;

    public Family(){
        this.family = new HashMap<>();
    }

    public void add(Person... people){
        for(Person p : people){
        String key= p.getFullName();
        family.put(key, p);
        }
    }
    public Person get(String key){
        return family.get(key);
    }


}
