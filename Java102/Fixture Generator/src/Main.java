import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> teams = new ArrayList<>();

        teams.add("Galatasaray");
        teams.add("Bursaspor");
        teams.add("Fenerbahçe");
        teams.add("Beşiktaş");
        teams.add("Başakşehir");
        teams.add("Trabzonspor");


        FixtureGenerator fixtureGenerator = new FixtureGenerator(teams);

        fixtureGenerator.createFixture();





    }
}
