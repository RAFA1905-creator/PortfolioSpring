package com.rafael.portfolio.controller;

import com.rafael.portfolio.service.InfoService;
import com.rafael.portfolio.service.ExperienciaService;
import com.rafael.portfolio.service.EstudioService;
import com.rafael.portfolio.service.ProyectoService;
import com.rafael.portfolio.service.LenguajeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final InfoService infoService;
    private final ExperienciaService experienciaService;
    private final EstudioService estudioService;
    private final ProyectoService proyectoService;
    private final LenguajeService lenguajeService;

    public HomeController(
            InfoService infoService,
            ExperienciaService experienciaService,
            EstudioService estudioService,
            ProyectoService proyectoService,
            LenguajeService lenguajeService
    ) {
        this.infoService = infoService;
        this.experienciaService = experienciaService;
        this.estudioService = estudioService;
        this.proyectoService = proyectoService;
        this.lenguajeService = lenguajeService;
    }

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("info", infoService.findAll());
        model.addAttribute("experiencias", experienciaService.findAll());
        model.addAttribute("estudios", estudioService.findAll());
        model.addAttribute("proyectos", proyectoService.findAll());
        model.addAttribute("lenguajes", lenguajeService.findAll());

        return "index"; // templates/index.html
    }
}