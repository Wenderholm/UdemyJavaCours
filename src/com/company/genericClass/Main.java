package com.company.genericClass;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("beckham ");

        Team newCrowTeam  = new Team("New Crow Team");
        newCrowTeam.addPlayer(joe);
        newCrowTeam.addPlayer(pat);
        newCrowTeam.addPlayer(beckham);

        newCrowTeam.addPlayer(joe);
    }
}
