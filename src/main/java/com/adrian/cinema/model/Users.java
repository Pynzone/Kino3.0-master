package com.adrian.cinema.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Access(AccessType.FIELD)
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long userId;
    @Column(name = "email", nullable = false)
    @NotBlank
    private String email;
    @Column(name = "name",nullable = false)
    @NotBlank
    private String name;
    @Column(name = "surname",nullable = false)
    @NotBlank
    private String surname;
    @Column(name = "phone")
    private Long phone;

    public Long getId_user() {
        return userId;
    }

    public void setId_user(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }
}
