package pl.edu.wszib.springtalkingwithworld.configuration;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
@RequestMapping("/parameterTester")
public class RequestParamController {

    @GetMapping
    public ResponseEntity get(@RequestParam("liczby") int[] liczby)
                              /*@RequestParam("druga") int liczba2,
                              @RequestParam(value = "trzecia", required = false) Integer trzecia) //Integer bo moze byc null*/
    {
        return ResponseEntity.ok(Arrays.stream(liczby).count());

    }


}
