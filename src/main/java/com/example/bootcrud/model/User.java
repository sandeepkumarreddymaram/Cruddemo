package com.example.bootcrud.model;


import jakarta.persistence.*;

@Entity
    @Table(name = "users")
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
       Long id;



    @Column(nullable = false)
       String name;

        @Column(nullable = false)
        Integer age;

        public User() {
        }


    public User(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        // getters and setters
    }



