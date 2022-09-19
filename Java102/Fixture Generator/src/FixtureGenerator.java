import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FixtureGenerator {

    private ArrayList<String> teamList;
    

    public FixtureGenerator(ArrayList<String> arrayList) {

        this.teamList = arrayList;
    }

    public void createFixture() {

        if (this.teamList.size() % 2 != 0) {

            this.teamList.add("Bay");
        }

        int firstTeamIndex;
        int secondTeamIndex;
        int matchCounter;
        int roundCounter = 1;
        boolean isMatchesValid;
        Random rnd = new Random();
        
        Boolean[][] teamTable = new Boolean[this.teamList.size()][this.teamList.size()];
        Boolean[][] teamTableTemp = new Boolean[this.teamList.size()][this.teamList.size()];;
        Boolean[] isTeamHasMatch = new Boolean[this.teamList.size()];

        ArrayList<Integer> teamIndexesForMatches;


        for (int i = 0; i < teamTable.length; i++) {
            for (int j = 0; j < teamTable[0].length; j++) {

                teamTable[i][j] = i == j;           // Creating boolean table to see which team matched with which team
            }
            
        }



        System.out.println("Teams");

        for (String team : teamList) {
            System.out.println("-" + team);     // Printing teams
        }

        System.out.println();
        
        while (roundCounter <= (this.teamList.size()-1) * 2) {

            isMatchesValid = false;

            Arrays.fill(isTeamHasMatch, false);
            System.out.println("Round: " + roundCounter);

            for (int i = 0; i < teamTable.length; i++) {

                teamTableTemp[i] = teamTable[i].clone();
            }

            while (!isMatchesValid) {       // This loop stops when there is three valid exhibition

                matchCounter = 0;
                teamIndexesForMatches = new ArrayList<>();


                for (int i = 0; i < 3; i++) {

                    firstTeamIndex = rnd.nextInt(teamList.size());
                    secondTeamIndex = rnd.nextInt(teamList.size());

                    if (roundCounter <= (this.teamList.size()-1)) {     // First half of the matches

                        if (!teamTable[firstTeamIndex][secondTeamIndex] && !teamTable[secondTeamIndex][firstTeamIndex] &&   // Checking teams have encountered before
                                !isTeamHasMatch[firstTeamIndex] && !isTeamHasMatch[secondTeamIndex]) {              // Checking team has a match or not

                            teamIndexesForMatches.add(firstTeamIndex);
                            teamIndexesForMatches.add(secondTeamIndex);

                            teamTable[firstTeamIndex][secondTeamIndex] = true;
                            isTeamHasMatch[firstTeamIndex] = true;
                            isTeamHasMatch[secondTeamIndex] = true;     // Assigning values to prevent double encountering
                            matchCounter++;

                        }
                    }

                    else {      // Second half of the matches

                        if (!teamTable[firstTeamIndex][secondTeamIndex] && !isTeamHasMatch[firstTeamIndex] && !isTeamHasMatch[secondTeamIndex]) {

                            teamIndexesForMatches.add(firstTeamIndex);
                            teamIndexesForMatches.add(secondTeamIndex);

                            teamTable[firstTeamIndex][secondTeamIndex] = true;
                            isTeamHasMatch[firstTeamIndex] = true;
                            isTeamHasMatch[secondTeamIndex] = true;
                            matchCounter++;

                        }

                    }

                }

                if (matchCounter == 3) {    // Printing matches
                    isMatchesValid = true;
                    System.out.println(teamList.get(teamIndexesForMatches.get(0)) + " vs " + teamList.get(teamIndexesForMatches.get(1)));
                    System.out.println(teamList.get(teamIndexesForMatches.get(2)) + " vs " + teamList.get(teamIndexesForMatches.get(3)));
                    System.out.println(teamList.get(teamIndexesForMatches.get(4)) + " vs " + teamList.get(teamIndexesForMatches.get(5)));
                }

                else {  // When there is not 3 valid matches, setting truth tables to previous state

                    for (int i = 0; i < teamTableTemp.length; i++) {

                        teamTable[i] = teamTableTemp[i].clone();
                    }
                    Arrays.fill(isTeamHasMatch, false);
                }

            }

            roundCounter++;
            System.out.println();

        }

    }

}
