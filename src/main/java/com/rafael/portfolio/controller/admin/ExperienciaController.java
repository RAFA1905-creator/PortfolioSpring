package com.rafael.portfolio.controller.admin;

import com.rafael.portfolio.model.Experiencia;
import com.rafael.portfolio.service.ExperienciaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/experiencias")
public class ExperienciaController {

    private final ExperienciaService service;

    public ExperienciaController(ExperienciaService service) {
        this.service = service;
    }

    @GetMapping
    public String openForm(Model model) {
        model.addAttribute("experiencias", service.findAll());
        model.addAttribute("experiencia", new Experiencia());
        return "admin/experiencia-form";
    }

    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("experiencias", service.findAll());
        model.addAttribute("experiencia", service.findById(id));
        return "admin/experiencia-form";
    }

    @PostMapping
    public String save(@ModelAttribute Experiencia experiencia) {
        service.save(experiencia);
        return "redirect:/admin/experiencias";
    }

    @PostMapping("/{id}")
    public String update(@PathVariable Long id, @ModelAttribute Experiencia experiencia) {
        experiencia.setId(id);
        service.save(experiencia);
        return "redirect:/admin/experiencias";
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/admin/experiencias";
    }
}
