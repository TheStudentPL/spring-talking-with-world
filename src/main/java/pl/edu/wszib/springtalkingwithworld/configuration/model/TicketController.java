package pl.edu.wszib.springtalkingwithworld.configuration.model;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;


    @Controller
    @RequestMapping("/bilety")
    public static class TicketController {

        private Map<String, Bilet> mapa = new HashMap<>();

        @GetMapping("/{id}")
        public ResponseEntity<Bilet> odbierz(@PathVariable String id){
            return ResponseEntity.ok(bilet);
        }

        @PostMapping
        public ResponseEntity dodaj(Bilet){
            mapa.put(bilet.id, bilet);
            return ResponseEntity.ok().build();

        }

    }

