package com.rafael.portfolio.controller.admin;

import com.rafael.portfolio.model.Estudio;
import com.rafael.portfolio.service.EstudioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/estudios")
public class EstudioController {

    private final EstudioService service;

    public EstudioController(EstudioService service) {
        this.service = service;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("estudios", service.findAll());
        return "admin/estudio-list";
    }

    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("estudio", new Estudio());
        return "admin/estudio-form";
    }

    @PostMapping
    public String save(@ModelAttribute Estudio estudio) {
        service.save(estudio);
        return "redirect:/admin/estudios";
    }

    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("estudio", service.findById(id));
        return "admin/estudio-form";
    }

    @PostMapping("/{id}")
    public String update(@PathVariable Long id, @ModelAttribute Estudio estudio) {
        estudio.setId(id);
        service.save(estudio);
        return "redirect:/admin/estudios";
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/admin/estudios";
    }
}
