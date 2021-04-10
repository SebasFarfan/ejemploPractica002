package com.ejemplo.tp2.ejemploPractica.controller;

import com.ejemplo.tp2.ejemploPractica.model.Libro;
import com.ejemplo.tp2.ejemploPractica.service.ILibroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LibroController {
    @Autowired
    private ILibroService libroService;
    @Autowired
    private Libro libro;

    @GetMapping("/libro")
    public String getLibro(Model model) {
        model.addAttribute(libro);
        return "libro";
    }

    @PostMapping("/libro/guardar")
    public String agregarLibro(@ModelAttribute("libro") Libro libro) {
        libroService.agregarLibro(libro);
        return "resultado";
    }
}
