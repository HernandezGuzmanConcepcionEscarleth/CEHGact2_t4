package com.informaticonfig.spring.app1.springboot_applications.controllers;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import com.informaticonfig.spring.app1.springboot_applications.models.dto.EmpleadoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.informaticonfig.spring.app1.springboot_applications.models.Empleados;


@Controller 
public class EjemploController {

    @GetMapping("/detalles_info")
    
    public String info(Model model){
        Empleados empleado1=new Empleados("Juan", "Rodriguez", null,"Gerente",
                                          35, 123456789, 001);
                                          model.addAttribute("Titulo","Informacion del empleado");
                                          model.addAttribute("empleado",empleado1);

        return "detalles_info";

    }
    @ModelAttribute("Empleados")
    public List<Empleados> ListaEmpleados(){
        return  Arrays.asList(
            new Empleados("Maria", "Perez", "Calle segunda no 2", 
                 "Secretaria", 20, 123456789, 02),
              new Empleados("Martha", "Poblete", "Calle segunda no.8",
          "Contadora", 209, 198844987, 06),
          new Empleados("Juan", "Rodriguez", "Calle primera no.1", "Gerente", 35, 123456789, 01),
          new Empleados("Luis", "Martínez", "Calle tercera no.3", "Contador", 28, 987654321, 03),
          new Empleados("Ana", "González", "Avenida central no.4", "Diseñadora", 30, 456789123, 04),
          new Empleados("Pedro", "Sánchez", "Boulevard no.5", "Analista", 25, 789123456, 05)
        );

    }

    @Value("${config.nombre}")
private String nombreProyecto;

@ModelAttribute("proyecto")
public String proyecto() {
    return nombreProyecto;
}

@GetMapping("/formulario")
public String formulario(Model model) {
    model.addAttribute("empleadoForm", new EmpleadoDTO());
    return "formulario";
}

@PostMapping("/guardar")
public String guardar(@ModelAttribute("empleadoForm") EmpleadoDTO empleadoForm, Model model) {
    model.addAttribute("recibido", empleadoForm);
    return "resultado";
}
    
}
