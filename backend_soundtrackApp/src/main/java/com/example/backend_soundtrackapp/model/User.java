package com.example.backend_soundtrackapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
// Learned new thing: Lombok has a special feature - automatically generate constructors, getter and setter
@NoArgsConstructor // this is for non-argument constructor
@AllArgsConstructor  // this is for argument constructor
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private String role; // Two roles: Admin and User
}
