
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        System.out.println("Top ten players based on goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
                
        System.out.println("Top 25 playes based on penalty amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        
        System.out.println("Print statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("Statistics for Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        
        System.out.println("Players of Anaheim Ducks ordered by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
    }
}
