package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    /* ArrayList<Team> teams;
	    * Collections.sort(teams);
	    * Create a generic class to implement a league table for a sport.
	    * The class should allow teams to be added to the list, and store
	    * a list of teams that belong to the league
	    *
	    * Your class should have a method to print out the teams in order,
	    * with the team at the top of the league printed first.
	    *
	    * Only teams of the same type should be added to any particular
	    * instance of the league class - the program should fail to compile
	    * if an attempt is made to add an incompatible team.*/

    	League<Team<FootballPlayer>> footballLeague = new League<>("AFL");

		Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
		Team<FootballPlayer> melbourne = new Team<>("Melbourne");
		Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
		Team<FootballPlayer> fremantle = new Team<>("Fremantle");

		hawthorn.matchResult(fremantle, 1, 0);
		hawthorn.matchResult(adelaideCrows, 3, 8);
		adelaideCrows.matchResult(fremantle, 2, 1);

    	footballLeague.add(adelaideCrows);
		footballLeague.add(melbourne);
		footballLeague.add(hawthorn);
		footballLeague.add(fremantle);

		Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
    	//footballLeague.add(baseballTeam);
		footballLeague.showLeagueTable();

		FootballPlayer joe = new FootballPlayer("Joe");
		BaseballPlayer pat = new BaseballPlayer("Pat");
		SoccerPlayer beckham = new SoccerPlayer("Beckham");

		Team rawTeam = new Team("Raw Team");
		rawTeam.addPlayer(joe);
		rawTeam.addPlayer(pat);
		rawTeam.addPlayer(beckham);

		League<Team> rawLeague = new League<>("Raw League");
		rawLeague.add(adelaideCrows);
		rawLeague.add(baseballTeam);
		rawLeague.add(rawTeam);

		League reallyRaw = new League("Really raw");
		reallyRaw.add(adelaideCrows);
		reallyRaw.add(baseballTeam);
		reallyRaw.add(rawTeam);

    }
}
