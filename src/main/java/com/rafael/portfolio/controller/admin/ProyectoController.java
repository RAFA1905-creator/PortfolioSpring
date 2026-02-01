package com.rafael.portfolio.controller.admin;

import com.rafael.portfolio.model.Proyecto;
import com.rafael.portfolio.service.ProyectoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/proyectos")
public class ProyectoController {

    private final ProyectoService service;

    public ProyectoController(ProyectoService service) {
        this.service = service;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("proyectos", service.findAll());
        return "admin/proyecto-list";
    }

    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("proyecto", new Proyecto());
        return "admin/proyecto-form";
    }

    @PostMapping
    public String save(@ModelAttribute Proyecto proyecto) {
        service.save(proyecto);
        return "redirect:/admin/proyectos";
    }

    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("proyecto", service.findById(id));
        return "admin/proyecto-form";
    }

    @PostMapping("/{id}")
    public String update(@PathVariable Long id, @ModelAttribute Proyecto proyecto) {
        proyecto.setId(id);
        service.save(proyecto);
        return "redirect:/admin/proyectos";
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/admin/proyectos";
    }
}
