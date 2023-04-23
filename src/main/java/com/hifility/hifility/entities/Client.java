package com.hifility.hifility.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "clients")
@Getter @Setter
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @NotEmpty
    private Long Id;
    @NotEmpty
    @NotNull
    private String name;
    @Email
    @NotEmpty
    @NotNull
    private String email;
    @NotNull
    @NotEmpty
    private String phone;
    @NotEmpty
    @NotNull
    private String address;
    @NotEmpty
    @NotNull
    private String password;


}