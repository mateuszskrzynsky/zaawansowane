package pl.sda.mg.streamApi.task1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public
class FootballerDatabase implements FootballRepository {

    public static List<Footballer> footballers;

    static {
        //generuje piłkarzy
        footballers = getFootballers();
    }

    private static List<Footballer> getFootballers() {
        return Arrays.asList(
                Footballer.builder()
                        .firstName("Cristiano")
                        .lastName("Ronaldo")
                        .birthYear(1985)
                        .marketStatus(MarketStatus.SIGNED)
                        .address(Address.builder()
                                .street("123 Main St")
                                .city("Turin")
                                .zipCode("10100")
                                .build())
                        .previousClubs(Arrays.asList(
                                Club.builder()
                                        .country(Country.ENGLAND)
                                        .clubName("Manchester United")
                                        .build(),
                                Club.builder()
                                        .country(Country.SPAIN)
                                        .clubName("Real Madrid")
                                        .build(),
                                Club.builder()
                                        .country(Country.ITALY)
                                        .clubName("Juventus")
                                        .build())).build(),
                Footballer.builder()
                        .firstName("Lionel")
                        .lastName("Messi")
                        .birthYear(1987)
                        .marketStatus(MarketStatus.SIGNED)
                        .address(Address.builder()
                                .street("456 Park Ave")
                                .city("Paris")
                                .zipCode("75001")
                                .build())
                        .previousClubs((Arrays.asList(
                                Club.builder()
                                        .country(Country.SPAIN)
                                        .clubName("FC Barcelona")
                                        .build(),
                                Club.builder()
                                        .country(Country.FRANCE)
                                        .clubName("PSG")
                                        .build(),
                                Club.builder()
                                        .country(Country.USA)
                                        .clubName("Inter Miami")
                                        .build())))
                        .build(),
                Footballer.builder()
                        .firstName("Neymar")
                        .lastName("Jr.")
                        .birthYear(1992)
                        .marketStatus(MarketStatus.ON_LOAN)
                        .address(Address.builder()
                                .street("789 Beach Rd")
                                .city("Paris")
                                .zipCode("75002")
                                .build())
                        .previousClubs((Arrays.asList(
                                Club.builder()
                                        .country(Country.BRAZIL)
                                        .clubName("Santos FC")
                                        .build(),
                                Club.builder()
                                        .country(Country.SPAIN)
                                        .clubName("FC Barcelona")
                                        .build(),
                                Club.builder()
                                        .country(Country.FRANCE)
                                        .clubName("PSG")
                                        .build())))
                        .build(),
                Footballer.builder()
                        .firstName("Robert")
                        .lastName("Lewandowski")
                        .birthYear(1988)
                        .marketStatus(MarketStatus.SIGNED)
                        .address(Address.builder()
                                .street("567 Stadium St")
                                .city("Munich")
                                .zipCode("80000")
                                .build())
                        .previousClubs(Arrays.asList(
                                Club.builder()
                                        .country(Country.GERMANY)
                                        .clubName("Borussia Dortmund")
                                        .build(),
                                Club.builder()
                                        .country(Country.GERMANY)
                                        .clubName("Bayern Munich")
                                        .build(),
                                Club.builder()
                                        .country(Country.SPAIN)
                                        .clubName("FC Barcelona")
                                        .build()))
                        .build(),
                Footballer.builder()
                        .firstName("Mohamed")
                        .lastName("Salah")
                        .birthYear(1992)
                        .marketStatus(MarketStatus.SIGNED)
                        .address(Address.builder()
                                .street("222 Pyramid Ave")
                                .city("Liverpool")
                                .zipCode("L4 0TH")
                                .build())
                        .previousClubs(Arrays.asList(
                                Club.builder()
                                        .country(Country.ENGLAND)
                                        .clubName("Chelsea")
                                        .build(),
                                Club.builder()
                                        .country(Country.ITALY)
                                        .clubName("AS Roma")
                                        .build(),
                                Club.builder()
                                        .country(Country.ENGLAND)
                                        .clubName("Liverpool")
                                        .build()))
                        .build(),
                Footballer.builder()
                        .firstName("Kevin")
                        .lastName("De Bruyne")
                        .birthYear(1991)
                        .marketStatus(MarketStatus.SIGNED)
                        .address(Address.builder()
                                .street("333 Etihad Rd")
                                .city("Manchester")
                                .zipCode("M11 3FF")
                                .build())
                        .previousClubs(Arrays.asList(
                                Club.builder()
                                        .country(Country.ENGLAND)
                                        .clubName("Borussia Dortmund")
                                        .build(),
                                Club.builder()
                                        .country(Country.GERMANY)
                                        .clubName("Vfl Wolfsburg")
                                        .build(),
                                Club.builder()
                                        .country(Country.ENGLAND)
                                        .clubName("Manchester City")
                                        .build()))
                        .build()
        );
    }


    @Override
    public List<Footballer> add(Footballer footballer) {
        return null;
    }

    @Override
    public List<Footballer> delete(Footballer footballer) {
        return null;
    }

    @Override
    public List<Footballer> findByLastName(String lastName) {
        return footballers.stream()
                .filter(footballer -> footballer.getLastName().equalsIgnoreCase(lastName))
                .collect(Collectors.toList());


    }

    @Override
    public List<Footballer> findByClub(String clubName) {

        return footballers.stream()
                .filter(footballer -> footballer.getPreviousClubs()
                        .stream().anyMatch(club -> club.getClubName().equalsIgnoreCase(clubName)))
                .collect(Collectors.toList());


    }

    @Override
    public List<Footballer> findAll() {
        return footballers;
    }

    @Override
    public List<Footballer> findByCity(String city) {
        return footballers.stream()
                .filter(footballer -> footballer.getAddress().getCity().equals(city))
                .collect(Collectors.toList());
    }

    //@Override
    //public Set<String> uniqueClubs(String club) {
    //    Set<String> footballerStream = footballers.stream()
    //           .flatMap(footballer -> footballer.getPreviousClubs().stream())
    //           .map(club -> club.getClubName())
    //          .collect(Collectors.toSet());
    //  return footballerStream;
    //}
}