package pl.edu.wszib.springtalkingwithworld.configuration;

import org.springframework.beans.factory.annotation.Autowired;

public class User {

    private String imie;
    private String nazwisko;

    @Autowired
    public User(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Autowired
    public String getImie() {
        return imie;
    }

    @Autowired
    public String getNazwisko() {
        return nazwisko;
    }
}
