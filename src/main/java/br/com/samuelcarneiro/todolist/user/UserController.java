package br.com.samuelcarneiro.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador
 * public - qualquer um tem acesso
 * private - alguns recursos
 * protected - somente quem está no mesmo pacote
 */

@RestController
@RequestMapping("/users")
public class UserController {
    
    //Método de cadastro
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) {
        //Receber dados do cliente
        System.out.println(userModel.name);
    }
}
