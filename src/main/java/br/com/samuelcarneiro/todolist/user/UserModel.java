package br.com.samuelcarneiro.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * Adicionando a dependencia do Lombok no arquivo 'pom.xml' que permite
 * adicionar automaticamente os getters e setters.
 * 
 * @data - adiciona os getters e setters
 * @getters - adiciona somente os getters
 * @setters - adiciona somente os setters
 */

@Data
// Tabela utilizada do banco de dados
@Entity(name="tb_users")
//Informações do usuário
public class UserModel {

    @Id
    @GeneratedValue(generator="UUID")
    private UUID id;

    //Impedindo mais de um username igual
    @Column(unique=true)
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

    /**
     * Métodos:
     * - getters - recuperar um valor
     * - setters - inserir um valor
    */

}
