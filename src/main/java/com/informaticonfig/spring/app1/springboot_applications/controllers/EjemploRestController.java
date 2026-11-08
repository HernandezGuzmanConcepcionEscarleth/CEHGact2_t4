package com.informaticonfig.spring.app1.springboot_applications.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.informaticonfig.spring.app1.springboot_applications.models.Empleados;
import com.informaticonfig.spring.app1.springboot_applications.models.dto.ClaseDTO;

import org.springframework.web.bind.annotation.RequestParam;



@RestController 
@RequestMapping("/api")


public class EjemploRestController {

    @GetMapping(path ="/detalles_info2")
    
    public ClaseDTO detalles_info2() {
        ClaseDTO usuario1=new ClaseDTO();
        usuario1.setTitulo("Administrafdor");
        usuario1.setUsuario("Informaticonfig");


        //Empleados empleado1=new Empleados("Juan", "Rodriguez", "Calle No 2", "Gerente",
                                         // 35, 123456789, 001);//


        //Map<String, Object> respuesta = new HashMap<>();
        //respuesta.put("Empleado", "Datos empleado");
       // respuesta.put("Informacion", empleado1);///
        return usuario1;

    }
    
}
