package pl.edu.wszib.springtalkingwithworld;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.activation.MimeType;

@Controller
@RequestMapping("/moj")
public class MyController {

    @GetMapping
    public ResponseEntity get(){
        ResponseEntity entity = new ResponseEntity("Hello World!", HttpStatus.OK);
        return entity;
    }

    //localhost/moj/json
    @GetMapping(value = "/json", produces = "application/json")
    public ResponseEntity getJson(){
        String json = "{\n" +
                "   \"imie\" : \"Adam\",\n" +
                "   \"szkola\":  {\n" +
                "    \"nazwa\" : \"SP 11\",\n" +
                "    \"adres\" : \"Zielona 44\"\n" +
                "  },\n" +
                "  \"oceny\" : [5,5,5]\n" +
                "}";
        ResponseEntity entity = new ResponseEntity(json, HttpStatus.OK);
        return entity;
    }

    //przeslanie danych w sciezce



}
