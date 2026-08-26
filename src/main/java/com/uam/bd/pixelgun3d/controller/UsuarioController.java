package com.uam.bd.pixelgun3d.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    @GetMapping("/ping")
    public String testarconexao() {
    return "A API de Usuários está online e funcionando!";
}
};
