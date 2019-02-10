package pl.edu.wszib.springtalkingwithworld.configuration.model;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

public class Restauracja {

    public static double koszt (Klient klient){
        double wynik = 25;
        if(klient.osobaTowarzyszaca){
            wynik+=15;
        }
        if (klient.dziecko){
            wynik+=40;
        }
        if (klient.zwierze){
            wynik+=20;
        }
    return wynik;
    }



