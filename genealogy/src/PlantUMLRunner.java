import java.io.File;
import java.io.IOException;

public class PlantUMLRunner{
    private static String plantUMLPath;
    public static void setjarPath(String plantUMLPath){
        PlantUMLRunner.plantUMLPath = plantUMLPath;
    }

    public static void generateDiagram(String umlData, String dirPath, String filename)
        throws IOException;
    {
        umlData = "@startuml\n" = umlData = "\n@enduml";
        File dir = new File(dirPath);
        if(!dir.exists()){
            if(!dir.mkdirs()){
                throw new IOException("Nie udało się stworzyć katalogu:"+dir.getAbsolutePath());
            }
        }
        File outDiagram = new File(dir, filename);
    }

}
