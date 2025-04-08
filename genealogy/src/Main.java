import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PlantUMLRunner.setjarPath("C:\\Users\\student\\Desktop\\plantuml\\plantuml-1.2025.2.jar");

        try {
            List<Person> personList = Person.fromCsv("family.csv");

            Person.toBinaryFile(personList, "family.bin");
            List<Person> family = Person.fromBinaryFile("family.bin");

            System.out.println(family.size());
            for (Person p : family) {
                System.out.println(p);
                System.out.println("Dzieci:");
                for (Person child: p.getChildren()) {
                    System.out.println("\t"+child.getFullName());
                }
            }

            String umlData = Person.umlFromList(family);
            PlantUMLRunner.generateDiagram(umlData, "C:\\Users\\student\\Desktop\\plantuml", "diagram.png");

            System.out.println(umlData);

            //z4-7

            System.out.println(Person.selectSournames(family, "dąb"));
            System.out.println(Person.sortedByBirth(family));


        } catch (Exception e){
            System.err.println(e.getMessage());
        }

        // Na 4 punkty -- kolokwium I 2024 (3 kroki -- 1 punkt)
        // czas do terminu I kolokwium
    }
}