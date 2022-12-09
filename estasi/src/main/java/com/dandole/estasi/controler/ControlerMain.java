package com.dandole.estasi.controler;


import com.dandole.estasi.model.Productos;
import com.dandole.estasi.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControlerMain {

    @Autowired
    private ProductosRepository productosRepository;

    @GetMapping("/")
    public String inicio(){
        return "index";
    }

    @GetMapping("/produ")
    public String productos(Model model){
        model.addAttribute("productos",productosRepository.findAll());
        return "productos";
    }

    @GetMapping("/crear")
    public String crear(){
        return "crear";
    }

    @PostMapping("/guardar")
    public String guardar (Productos producto){
        productosRepository.save(producto);
        return "redirect:/produ";
    }

    @GetMapping("/proveedor")
    public String proveedores(){
        return "proveedores";
    }





}
