package com.unab.apijava.controllers;

import com.unab.apijava.models.peticiones.UsuarioRegistrarRequestModel;
import com.unab.apijava.models.respuestas.UsuarioRestModel;
import com.unab.apijava.shared.usuarioCrearDTO;
import com.unab.apijava.shared.usuarioDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/usuarios")
public class UsuarioController {
    @Autowired
    ModelMapper modelmapper;


    @GetMapping
    public String obtenerUsuario(){
        
        return "Obtener Usuario";
    }
    
    @PostMapping
    public UsuarioRestModel crearUsuario(@RequestBody UsuarioRegistrarRequestModel usuarioRegistrarRequestModel){
        
        usuarioCrearDTO usuarioCrearDTO=modelmapper.map(usuarioRegistrarRequestModel, usuarioCrearDTO.class);

        // terminar de hacer el usuarioDTO//
        usuarioDTO usuarioDTO=modelmapper.map(usuarioCrearDTO, usuarioDTO.class);

        UsuarioRestModel usuarioRestModel=modelmapper.map(usuarioDTO, UsuarioRestModel.class);

        return usuarioRestModel;
    }
    
}
