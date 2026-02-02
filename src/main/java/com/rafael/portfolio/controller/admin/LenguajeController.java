package com.rafael.portfolio.controller.admin;

import com.rafael.portfolio.model.Lenguaje;
import com.rafael.portfolio.service.LenguajeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/lenguajes")
public class LenguajeController {

    private final LenguajeService service;

    public LenguajeController(LenguajeService service) {
        this.service = service;
    }

    @GetMapping
    public String openForm(Model model) {
        model.addAttribute("lenguajes", service.findAll());
        model.addAttribute("lenguaje", new Lenguaje());
        return "admin/lenguaje-form";
    }

    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("lenguajes", service.findAll());
        model.addAttribute("lenguaje", service.findById(id));
        return "admin/lenguaje-form";
    }

    @PostMapping
    public String save(@ModelAttribute Lenguaje lenguaje) {
        service.save(lenguaje);
        return "redirect:/admin/lenguajes";
    }

    @PostMapping("/{id}")
    public String update(@PathVariable Long id, @ModelAttribute Lenguaje lenguaje) {
        lenguaje.setId(id);
        service.save(lenguaje);
        return "redirect:/admin/lenguajes";
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/admin/lenguajes";
    }
}
