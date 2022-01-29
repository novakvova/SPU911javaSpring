package app.controllers;

import app.dto.Animal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {
    private static List<Animal> list = new ArrayList<>();
    @GetMapping("/")
    public List<Animal> index() {
//        Animal belka = new Animal();
//        belka.setId(1);
//        belka.setName("Білка Іванка");
//        list.add(belka);
//        Animal bober = new Animal();
//        bober.setId(2);
//        bober.setName("Бобер Славік");
//        list.add(bober);
        return list;
    }
    @GetMapping("/create")
    public String add(Animal animal)
    {
        list.add(animal);
        return "Додано";
    }
}
