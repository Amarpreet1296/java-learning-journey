package Projects.MiniCricketProject;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    public static List<Cricketer> getPlayers() {
        List<Cricketer> players = new ArrayList<>();
        players.add(new Cricketer("Virat Kohli", 35, "Batsman", 13000));
        players.add(new Cricketer("Rohit Sharma", 37, "Batsman", 11000));
        players.add(new Cricketer("MS Dhoni", 42, "Wicketkeeper", 10500));
        players.add(new Cricketer("Sachin Tendulkar", 50, "Batsman", 18000));
        players.add(new Cricketer("KL Rahul", 32, "Wicketkeeper", 4500));
        players.add(new Cricketer("Hardik Pandya", 30, "All-rounder", 3500));
        players.add(new Cricketer("Ravindra Jadeja", 35, "All-rounder", 2800));
        players.add(new Cricketer("Jasprit Bumrah", 31, "Bowler", 200));
        players.add(new Cricketer("Mohammed Shami", 33, "Bowler", 300));
        players.add(new Cricketer("Shubman Gill", 25, "Batsman", 2500));
        players.add(new Cricketer("Yuvraj Singh", 42, "All-rounder", 8700));
        players.add(new Cricketer("Suresh Raina", 38, "Batsman", 5600));
        players.add(new Cricketer("Rishabh Pant", 27, "Wicketkeeper", 3200));
        players.add(new Cricketer("Virender Sehwag", 45, "Batsman", 8200));
        players.add(new Cricketer("Anil Kumble", 53, "Bowler", 900));
        players.add(new Cricketer("Kapil Dev", 65, "All-rounder", 3800));
        players.add(new Cricketer("Zaheer Khan", 45, "Bowler", 800));
        players.add(new Cricketer("Harbhajan Singh", 44, "Bowler", 2200));
        players.add(new Cricketer("Ajinkya Rahane", 36, "Batsman", 5000));
        players.add(new Cricketer("Cheteshwar Pujara", 36, "Batsman", 7000));


        return players;
    }
}
