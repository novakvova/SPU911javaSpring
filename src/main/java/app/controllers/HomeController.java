package app.controllers;

import app.dto.Animal;
import app.entities.AnimalEntity;
import app.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {
    private final AnimalRepository animalRepository;

    @Autowired
    public HomeController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @GetMapping("/")
    public List<AnimalEntity> index() {
        return animalRepository.findAll();
    }
    @PostMapping("/create")
    public String add(AnimalEntity animal)
    {
        animalRepository.save(animal);
        return "Додано";
    }
}
