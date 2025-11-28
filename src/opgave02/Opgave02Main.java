package opgave02;

import opgave02.models.Team;
import opgave02.storage.ChampionsLeagueStorage;

import java.util.Arrays;

public class Opgave02Main {
    public static void main(String[] args) {
        ChampionsLeagueStorage storage = new ChampionsLeagueStorage();
        Team[] groupA = storage.getGroupA();
        Team[] groupB = storage.getGroupB();

        Team[] result = fletTeams(groupA,groupB);
        System.out.println(Arrays.toString(result));
    }

    public static Team[] fletTeams(Team[] teamAList, Team[] teamBList) {
        Team[] result = new Team[teamAList.length + teamBList.length];
        int i1 = 0;
        int i2 = 0;

        while (i1 < teamAList.length && i2 < teamBList.length) {
            if (teamAList[i1].getPoints() >= teamBList[i2].getPoints()) {
                result[i1 + i2] = teamAList[i1];
                i1++;
            } else {
                result[i1 + i2] = teamBList[i2];
                i2++;
            }
        }
        while (i1 < teamAList.length){
            result[i1 + i2] = teamAList[i1];
            i1++;
        }
        while (i2 < teamBList.length){
            result[i1 + i2] = teamBList[i2];
            i2++;
        }
        return result;
    }
}
