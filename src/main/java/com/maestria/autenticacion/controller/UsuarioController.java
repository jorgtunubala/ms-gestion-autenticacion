package com.maestria.autenticacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maestria.autenticacion.dto.request.LoginRequest;
import com.maestria.autenticacion.dto.response.LoginResponse;
import com.maestria.autenticacion.service.UsuarioService;

@RestController
@RequestMapping("/api/users")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        LoginResponse loginResponse = usuarioService.login(loginRequest);
        if (loginResponse != null) {
            return ResponseEntity.ok(loginResponse);
        } else {
            return ResponseEntity.status(405).build();
        }
    }

    /*@GetMapping("/names")
    public List<String> getAllPersonNames() {
        return usuarioService.getAllPersonNames();
    }*/
}
