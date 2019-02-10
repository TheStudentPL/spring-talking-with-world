package pl.edu.wszib.springtalkingwithworld.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserConfiguration {


    List<User> userList = new ArrayList();

    public void makeUsers() {
        userList.add(new User("Maciej", "Nowak"));
        userList.add(new User("Jan", "Malysz"));
        userList.add(new User("Piotr", "Zyla"));
    }

    @GetMapping(value = "/exist/{imie}/{nazwisko}")
    public ResponseEntity isExist(@PathVariable String imie, @PathVariable String nazwisko) {

            if (userList.contains(imie + "" + nazwisko)) {
                ResponseEntity entity = new ResponseEntity(HttpStatus.OK);
                return entity;
            } else {
                ResponseEntity entity = new ResponseEntity(HttpStatus.NOT_FOUND);
                return entity;
            }
        }

    @PostMapping(value = "/save/{imie}/{nazwisko}")
    public ResponseEntity saveUser(@PathVariable String imie, @PathVariable String nazwisko){
        userList.add(new User(imie, nazwisko));
        ResponseEntity entity = new ResponseEntity(HttpStatus.OK);
        return entity;
    }


}
