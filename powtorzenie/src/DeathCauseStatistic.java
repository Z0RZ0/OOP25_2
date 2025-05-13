import java.util.Arrays;

public class DeathCauseStatistic {

    private String ICD10;
    private int[] deaths;

    public DeathCauseStatistic(String ICD10, int[] deaths) {
        this.ICD10 = ICD10;
        this.deaths = deaths;
    }

    public String getICD10() {
        return ICD10;
    }

    public static DeathCauseStatistic fromCsvLine(String csvLine){
        String[] parts = csvLine.replace("\t", "").split(",", -1);
        String ICD10 = parts[0].trim();
        int[] death = new int[parts.length - 2];

        for (int i = 2; i < parts.length; i++) {
            String values = parts[i].trim();
            if(values.equals("-")){
                death[i-2]=0;
            }else{
                try{
                    death[i-2]=Integer.parseInt(values);
                }catch (NumberFormatException e){
                    throw new IllegalArgumentException("x");
                }
            }
        }

        return new DeathCauseStatistic(ICD10, death);
    }

    @Override
    public String toString() {
        return  "ICD10='" + ICD10 + '\'' +
                ", deaths=" + Arrays.toString(deaths) +
                '}';
    }

    public class AgeBracketDeaths{
        public final int young;
        public final int old;
        public final int deathCount;

        public AgeBracketDeaths(int young, int old, int deathCount) {
            this.young = young;
            this.old = old;
            this.deathCount = deathCount;
        }
    }

    public AgeBracketDeaths getDeathCount(int age){
        int index = age/5;
        if(index>19){
            throw new IllegalArgumentException("19");
        }
        int deathCount = deaths[index];
        int young = index*5;
        int old = young+4;
        return new AgeBracketDeaths(young, old, deathCount);
    }

}
