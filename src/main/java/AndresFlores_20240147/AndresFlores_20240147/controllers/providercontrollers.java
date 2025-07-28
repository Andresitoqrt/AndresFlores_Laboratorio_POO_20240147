package AndresFlores_20240147.AndresFlores_20240147.controllers;

import AndresFlores_20240147.AndresFlores_20240147.models.DTO.providerDTO;
import AndresFlores_20240147.AndresFlores_20240147.service.providerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/apiProvider")
public class providercontrollers {

    @Autowired
    private providerservice acceso;


    @GetMapping("/Proveedoresconsulta")
    public List<providerDTO> datosProveedores(){
        return acceso.getAllProviders();
    }

    @PostMapping("/RegistrarProveedores")
    @ResponseBody()
    public String getProveedores(@RequestBody providerDTO proverdores){
        Map<String,String> res = new HashMap<>();
        if ("proveedores".equalsIgnoreCase(proverdores.getProviderName()) &&
             "Proveedores".equalsIgnoreCase(proverdores.getProviderPhone())) {
            return "{ /Message/ : /success/}";
        }else {
            return "{ /Message/ : /fail/}";
        }

    }
}
