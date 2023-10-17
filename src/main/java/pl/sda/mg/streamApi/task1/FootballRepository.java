package pl.sda.mg.streamApi.task1;

import java.util.List;

public interface FootballRepository {

    List<Footballer> add(Footballer footballer);

    List<Footballer> delete (Footballer footballer);

    List<Footballer> findByLastName (Footballer footballer);

    List<Footballer> findByClub(String clubName);

    List<Footballer> findAll();
}
