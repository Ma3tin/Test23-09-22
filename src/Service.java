import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Service {
    public List<Country> atleast200mil() {
        Repository repo = new Repository();
        return repo.loadInput().stream().filter(country -> country.getPopulation() > 200000000).toList();
    }

    public List<Country> morePeopleThanRussia() {
        Repository repo = new Repository();
        Country russia = repo.loadInput().stream().filter(country -> country.getName().equals("Russia")).findFirst().get();
        return repo.loadInput().stream().filter(country -> russia.getPopulation() < country.getPopulation()).toList();
    }

    public List<Country> getRatio() {
        Repository repo = new Repository();
        List<Country> list = repo.loadInput().stream().filter(country -> country.getContinent().equals("Europe")).collect(Collectors.toList());
        Country mostPopulatedInEurope = repo.loadInput().stream().filter(country -> country.getContinent().equals("Europe")).sorted((o1, o2) -> (int) (o2.getPopulation() - o1.getPopulation())).findFirst().get();
        list.stream().forEach(country -> country.setRatio(Math.round((float) country.getPopulation() / mostPopulatedInEurope.getPopulation() * 10000) / 100f));
        return list;
    }
}

