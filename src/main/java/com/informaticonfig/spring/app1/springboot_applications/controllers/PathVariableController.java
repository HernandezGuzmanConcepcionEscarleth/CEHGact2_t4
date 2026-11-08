package com.informaticonfig.spring.app1.springboot_applications.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.informaticonfig.spring.app1.springboot_applications.models.dto.EmpleadoDTO;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController 
@RequestMapping ("/api/variable")
public class PathVariableController {

    @Value ("${config.usuario}")
    private String usuario;

    @Value ("${config.codigo}")
    private int codigo;

    @Value ("${config.mensaje}")
    private String mensaje;

    @Value ("${config.valores}")
    private String[] valores;

     @Value ("${config.nombre}")
    private String nombre;


    @GetMapping("/pagina1/{mensaje}")
    public ParametroDTO pagina1(@PathVariable String mensaje){

        ParametroDTO parametro1 = new ParametroDTO();
        parametro1.setInformacion(mensaje);
        return parametro1;
    }

    @PostMapping("/solicitud")
public EmpleadoDTO crEmpleados(@RequestBody EmpleadoDTO empleado1) {
    return empleado1;
}
    
    @GetMapping("/valores")
        public Map<String, Object> values(){
            Map<String, Object> json=new HashMap();
            json.put("usuario:", usuario);
            json.put("codigo:", codigo);
            json.put("mensaje:", mensaje);
            json.put("valores:", valores);
            json.put("valores:", nombre);
            
            return json;

    }

      
}
    
    
    

