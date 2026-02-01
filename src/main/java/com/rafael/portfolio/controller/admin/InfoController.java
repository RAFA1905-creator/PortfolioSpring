package com.rafael.portfolio.controller.admin;

import com.rafael.portfolio.model.Info;
import com.rafael.portfolio.service.InfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/info")
public class InfoController {

    private final InfoService service;

    public InfoController(InfoService service) {
        this.service = service;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("infoList", service.findAll());
        return "admin/info-list";
    }

    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("info", new Info());
        return "admin/info-form";
    }

    @PostMapping
    public String save(@ModelAttribute Info info) {
        service.save(info);
        return "redirect:/admin/info";
    }

    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("info", service.findById(id));
        return "admin/info-form";
    }

    @PostMapping("/{id}")
    public String update(@PathVariable Long id, @ModelAttribute Info info) {
        info.setId(id);
        service.save(info);
        return "redirect:/admin/info";
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/admin/info";
    }
}
