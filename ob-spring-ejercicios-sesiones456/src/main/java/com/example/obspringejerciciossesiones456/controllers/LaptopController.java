package com.example.obspringejerciciossesiones456.controllers;

import com.example.obspringejerciciossesiones456.entities.Laptop;
import com.example.obspringejerciciossesiones456.repository.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {

    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();
    }

    @PostMapping("/api/laptops")
    public void insertarLaptop(@RequestBody Laptop laptop){
        laptopRepository.save(laptop);
    }
}