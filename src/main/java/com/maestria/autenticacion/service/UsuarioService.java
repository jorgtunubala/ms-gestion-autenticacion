package com.maestria.autenticacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maestria.autenticacion.dto.request.LoginRequest;
import com.maestria.autenticacion.dto.response.LoginResponse;
import com.maestria.autenticacion.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository; 

    public LoginResponse login(LoginRequest loginRequest) {
        return usuarioRepository.authenticate(loginRequest);
    }

    /*public List<String> getAllPersonNames() {
        System.out.println("Consultando servicio...");
        return usuarioRepository.findAllPersonNames();
    }*/
}
