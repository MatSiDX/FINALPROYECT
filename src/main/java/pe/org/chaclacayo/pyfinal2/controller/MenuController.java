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
import pe.org.chaclacayo.pyfinal2.entity.Os;
import pe.org.chaclacayo.pyfinal2.service.OsService;

/**
 *
 * @author admin
 */
@Controller
@RequestMapping("/auth/main")
public class MenuController {
    
    @Autowired
    private OsService osService;
    
    @GetMapping
    public String main(){
        return "main";
    }    
    
    @GetMapping("/listos")
    public String listarOs(Model model){
        model.addAttribute("os", osService.readAll());
        return "mainos";
    }
    
    @GetMapping("/form")
    public String createOs(Model model){
        model.addAttribute("titulo", "Registrar Organización Social");
        model.addAttribute("os", new Os());
        return "form";
    }
    @PostMapping("/add")
    public String saveOs(@Valid @ModelAttribute Os os, BindingResult result, Model model, RedirectAttributes attributes){
        osService.create(os);        
        return "redirect:/auth/main/listos";
    } 
    @GetMapping("/mainmp")
    public String mainmp(){
        return "mainmp";
    }
    
    @GetMapping("/del/{idos}")
    public String deleteOs(Model model, @PathVariable("idos") Integer idos ){
        osService.delete(idos);
        return "redirect:/auth/main/listos";
    }//PUT,PATCH,GET;DELETE,POST
    
    @GetMapping("/edit/{idos}")
    public String editOs(Model model, @PathVariable("idos") Integer idos ){
        Os os = osService.read(idos);
        model.addAttribute("titulo", "Modificar OS");
        model.addAttribute("os", os);
        return "form";
    }
    
     @PostMapping("/{idos}")
    public String readOs(Model model, @PathVariable("idos") Integer idos ){
        model.addAttribute("os", osService.read(idos));
        return "redirect:/auth/main";
    }
    
     @GetMapping("/mainpv")
    public String mainpv(){
        return "mainpv";
    }
    
     @GetMapping("/mainds")
    public String mainds(){
        return "mainds";
    }
    
     @GetMapping("/mainos")
    public String mainos(){
        return "mainos";
    }
    
        @GetMapping("/registrar")
    public String registrar(){
        return "registrar";
    }
        @GetMapping("/registrar2")
    public String registrar2(){
        return "registrar2";
    }   
    
    
    @GetMapping("/perfil")
    public String perfil(){
        return "perfil";
    }
}
