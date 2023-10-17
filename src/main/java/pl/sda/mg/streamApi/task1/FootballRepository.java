package pl.sda.mg.streamApi.task1;

import java.util.List;
import java.util.Set;

public interface FootballRepository {

    List<Footballer> add(Footballer footballer);

    List<Footballer> delete (Footballer footballer);

    List<Footballer> findByLastName (String footballer);

    List<Footballer> findByClub(String clubName);

    List<Footballer> findAll();

    List<Footballer> findByCity(String city);

    //Set<String> uniqueClub();
}
