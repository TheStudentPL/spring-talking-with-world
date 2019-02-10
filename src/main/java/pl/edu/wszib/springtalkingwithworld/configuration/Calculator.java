package pl.edu.wszib.springtalkingwithworld.configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
@RequestMapping("/Calculator")
public class Calculator {

    @GetMapping(value = "/add")
    public ResponseEntity sum(@RequestParam("numbers") int[] numbers){

        return ResponseEntity.ok(Arrays.stream(numbers).sum());

    }

    @GetMapping(value = "/ratio")
    public ResponseEntity ratio(@RequestParam("numbers") int[] numbers){

            return ResponseEntity.ok(Arrays.stream(numbers).reduce((x,y)->x*y));

    }

    @GetMapping(value = "/avg")
    public ResponseEntity avg(@RequestParam("numbers") int[] numbers){

            return ResponseEntity.ok(Arrays.stream(numbers).average());

    }

    @GetMapping(value = "/odd")
    public ResponseEntity odd(@RequestParam("numbers") int[] numbers){

        return ResponseEntity.ok(Arrays.stream(numbers).reduce((x,y)->x-y));

    }

    @GetMapping(value = "/divide")
    public ResponseEntity div(@RequestParam("numbers") int[] numbers){
        return ResponseEntity.ok(Arrays.stream(numbers).filter(i-> i != 0).reduce((x,y)->x/y));
    }



}
