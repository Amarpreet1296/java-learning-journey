package Projects.MiniCricketProject;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CricketerService {

    private List<Cricketer> players;
    public CricketerService(List<Cricketer> players) {
        this.players = players;
    }

    public List <Cricketer> getTopScorers(int n) {
        return players.stream()
                .sorted(Comparator.comparingInt(Cricketer::getRuns).reversed())
                .limit(n)
                .collect(Collectors.toList());
    }


    public Map<String, List <Cricketer>> groupByRole() {
        return players.stream()
                .collect(Collectors.groupingBy(Cricketer::getRole));
    }

    public List<Cricketer> sortBy(String field) {
        Comparator<Cricketer> comparator;

        switch (field.toLowerCase()) {

            case "name":
                comparator = Comparator.comparing(Cricketer::getName);
                break;
            case "age":
                comparator = Comparator.comparingInt(Cricketer::getAge);
                break;
            case "runs":
                comparator = Comparator.comparingInt(Cricketer::getRuns).reversed();
                break;
            case "role":
                comparator = Comparator.comparing(Cricketer::getRole);
                break;

                default:
                    throw new IllegalArgumentException("Invalid field:  " + field);

        }

        return players.stream()
                .sorted(comparator)
                .toList();
    }

    public List<Cricketer> sortByNameLengthThenAlphabetical() {
        return players.stream()
                .sorted(
                        Comparator.comparing((Cricketer c) -> c.getName().length())
                                .thenComparing(Cricketer :: getName)
                ).toList();
    }

    public void swapPlayers(int i, int j) {
        if (i < 0 || j < 0 || i >= players.size() || j >= players.size()) {
            throw new IllegalArgumentException("Invalid indices: " + i + ", " + j);
        }

        Collections.swap(players, i, j);
    }




}
