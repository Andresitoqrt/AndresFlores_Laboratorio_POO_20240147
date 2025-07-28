package AndresFlores_20240147.AndresFlores_20240147.controllers;

import AndresFlores_20240147.AndresFlores_20240147.models.DTO.providerDTO;
import AndresFlores_20240147.AndresFlores_20240147.service.providerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apiProvider")
public class providercontrollers {

    @Autowired
    private providerservice acceso;


    @GetMapping("/Proveedores")
    public List<providerDTO> datosProveedores(){
        return acceso.getAllProviders();
    }
}
