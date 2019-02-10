package pl.edu.wszib.springtalkingwithworld.configuration.model;

public class Klient {

    public String imie;
    public boolean osobaTowarzyszaca;
    public boolean dziecko;
    public boolean zwierze;

    public Klient(String imie) {
        this.imie = imie;
    }

    public Klient(String imie, boolean osobaTowarzyszaca, boolean dziecko, boolean zwierze) {
        this.imie = imie;
        this.osobaTowarzyszaca = osobaTowarzyszaca;
        this.dziecko = dziecko;
        this.zwierze = zwierze;
    }





}
