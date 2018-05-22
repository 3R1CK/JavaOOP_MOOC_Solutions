
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author emeji
 */
public class Team {

    private String name;
    private ArrayList<Player> players;
    private int teamSize;

    public Team(String name) {

        this.teamSize =0;
        this.name = name;
        this.players = new ArrayList<Player>();
    }
    
    public int getTeamSize(){
        return this.teamSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void addPlayer(Player player) {
        
        if(size()<this.teamSize){
             players.add(player);
        }else if(this.teamSize==0){
            players.add(player);
        }
           
        

    }

    public int goals() {
        int totalGoals = 0;
        for (Player player : this.players) {
            totalGoals += player.goals();
        }
        return totalGoals;
    }

    public void printPlayers() {
        String playerAsString = "";
        for (Player ply : this.players) {
            playerAsString += ply.getName() + ", goals " + ply.goals() + "\n";

        }
        System.out.println(playerAsString);
    }

    public void setMaxSize(int size) {
        this.teamSize = size;

    }

    public int size() {
        //teamSize = players.size();
        return this.players.size();
    }
}
