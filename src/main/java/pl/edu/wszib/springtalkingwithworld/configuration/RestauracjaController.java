package pl.edu.wszib.springtalkingwithworld.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.edu.wszib.springtalkingwithworld.configuration.model.Klient;
import pl.edu.wszib.springtalkingwithworld.configuration.model.Restauracja;

import java.util.ArrayList;
import java.util.List;

// restauracja/koszt?imie=Adam&imie_osobytowaryszacej=Genowefa&imie_zwierzecia=burek$imiedziecka=Kubus tylko imie jest obowiazkowe

@Controller
@RequestMapping("/restauracja")
public class RestauracjaController {

    List<Klient> klients = new ArrayList();


    @GetMapping("/koszt")
    public ResponseEntity koszt(){

        return ResponseEntity.ok().build();
    }

    @GetMapping("/{imie}/{osobaTowarzyszaca}/{zwierze}/{dziecko}")
    public ResponseEntity reservation(@RequestParam String imie,
                            @RequestParam (required = false) boolean osobaTowarzyszaca,
                            @RequestParam (required = false) boolean zwierze, @RequestParam (required = false) boolean dziecko)
    {
        return ResponseEntity.ok().build();
    }



}
