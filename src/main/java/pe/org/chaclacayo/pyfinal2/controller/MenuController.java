/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.org.chaclacayo.pyfinal2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author admin
 */
@Controller
@RequestMapping("/auth/main")
public class MenuController {
    
    @GetMapping
    public String main(){
        return "main";
    }    
    
    @GetMapping("/mainmp")
    public String mainmp(){
        return "mainmp";
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
