package Projects.MiniCricketProject;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Cricketer> players = DataProvider.getPlayers();

        // create Service

        CricketerService service = new CricketerService(players);


        // top Scorer

        System.out.println("Top 5 Scoreres: ");
        service.getTopScorers(5)
                .forEach(System.out::println);
        // sort by names and runs
        System.out.println("\nSorted by Names: ");
        service.sortBy("name")
                .forEach(System.out::println);

        System.out.println("\nSorted by Runs: ");
        service.sortBy("runs")
                .forEach(System.out::println);


        System.out.println("\nGrouped by Role: ");
        Map<String,List<Cricketer>> grouped = service.groupByRole();

        for(String role : grouped.keySet()) {
            System.out.println("\nRole: " + role);
            grouped.get(role).forEach(System.out::println);
        }


        //SWAP DEMO

        System.out.println("\n Before Swap: ");
        System.out.println(players.get(0));
        System.out.println(players.get(1));

        service.swapPlayers(0, 1);

        System.out.println("\n🔁 After Swap:");
        System.out.println(players.get(0));
        System.out.println(players.get(1));


    }
}
