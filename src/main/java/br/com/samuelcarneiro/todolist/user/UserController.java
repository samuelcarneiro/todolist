package br.com.samuelcarneiro.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    //Chamando a interface
    @Autowired
    private IUserRepository userRepository;
    
    //Método de cadastro
    @PostMapping("/")
    public ResponseEntity create(@RequestBody UserModel userModel) {
        var user = this.userRepository.findByUsername(userModel.getUsername());

        if(user != null) {
            //Mensagem de erro
            //Status code
            return ResponseEntity.status(400).body("Usuário já existe");
        }

        //Receber dados do cliente
        var userCreated = this.userRepository.save(userModel);
        return ResponseEntity.status(200).body(userCreated);
    }
}
