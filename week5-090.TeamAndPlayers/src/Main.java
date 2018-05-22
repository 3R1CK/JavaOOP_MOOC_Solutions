public class Main {
    public static void main(String[] args) {
    Team barcelona = new Team("FC Barcelona");
        barcelona.setMaxSize(1);

        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above
        barcelona.setName("Josh");

        System.out.println("Number of players: " + barcelona.size());
        System.out.println("The max number of players can be "+ barcelona.getTeamSize());
    }
}