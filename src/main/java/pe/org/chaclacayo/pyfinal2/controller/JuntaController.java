/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.org.chaclacayo.pyfinal2.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pe.org.chaclacayo.pyfinal2.service.JuntaService;

/**
 *
 * @author admin
 */
@Controller
@RequestMapping("/junta")
public class JuntaController {
    
    @Autowired
    private JuntaService juntaService;   
     
    
    @GetMapping("/listjunta")
    public String listarJunta(Model model){
        model.addAttribute("junta", juntaService.readAll());
        return "mainmp";
    }     
    
    @GetMapping("/listjunta2")
    public String listarJunta2(Model model){
        model.addAttribute("junta", juntaService.readAll());
        return "mainpv";
    }
    
    @GetMapping("/listjunta3")
    public String listarJunta3(Model model){
        model.addAttribute("junta", juntaService.readAll());
        return "mainds";
    }
}
