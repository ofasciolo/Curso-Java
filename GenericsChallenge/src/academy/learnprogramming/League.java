package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {

    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team){
        if (teams.contains(team)){
            return false;
        }
        teams.add(team);
        return true;
    }

    public void showLeagueTable(){
        Collections.sort(teams);
        for (T team: teams){
            System.out.println(team.getName() + ": " + team.ranking());
        }
    }
}
