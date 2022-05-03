package edu.fidelitas.guilder_finalexam_sc403.Controler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping(  {"/", "/Home"})
    public String Ejemplo() {  return "/Ejemplo"; }
    }
