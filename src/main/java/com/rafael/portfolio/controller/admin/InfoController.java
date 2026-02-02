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
    public String editForm(Model model) {

        // Como solo hay un registro, lo obtenemos directamente
        Info info = service.findFirst();

        // Si la tabla está vacía, creamos un registro nuevo
        if (info == null) {
            info = new Info();
        }

        model.addAttribute("info", info);
        return "admin/info-form";
    }

    @PostMapping
    public String update(@ModelAttribute Info info) {
        service.save(info);
        return "redirect:/admin/info";
    }
}
