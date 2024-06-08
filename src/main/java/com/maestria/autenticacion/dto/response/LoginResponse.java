package com.maestria.autenticacion.dto.response;

import lombok.Data;

@Data
public class LoginResponse {
    private String nombres;
    private String apellidos;
    private String correo;
    private String rol;
}
