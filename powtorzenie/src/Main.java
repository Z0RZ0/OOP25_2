public class Main {
    public static void main(String[] args) {

        String kod = "A04.6          ,1,-,-,-,-,-,-,-,-,-,-,-,-,1,-,-,-,-,-,-,-";
        DeathCauseStatistic test = DeathCauseStatistic.fromCsvLine(kod);
        System.out.println(test);

        DeathCauseStatistic.AgeBracketDeaths bracket = test.getDeathCount(35);
        System.out.println("Kod ICD-10: " + test.getICD10());
        System.out.println("Wiek: "+ bracket.young + "-" + bracket.old);
        System.out.println("Zgony: "+ bracket.deathCount);
    }
}