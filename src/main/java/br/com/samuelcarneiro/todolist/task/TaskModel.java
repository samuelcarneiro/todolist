package br.com.samuelcarneiro.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.cglib.core.Local;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

    /**
     * O que uma tarefa tem? 
     * 
     * ID
     * Usuário
     * Descrição
     * Título
     * Data de início
     * Data de término
     * Prioridade
     */
@Data
@Entity(name = "tb_tasks")
public class TaskModel {
    
    @Id //Chave primária
    @GeneratedValue(generator = "UUID") //Gerará o ID automáticamente para a tarefa
    private UUID id;
    private String description;
    //Limitar a quantidade de caracteres no titulo em 50
    @Column(length = 50)
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority;
    private UUID idUser;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
