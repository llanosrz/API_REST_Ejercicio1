package com.example.entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "mascotas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

// @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;

    //@Enumerated(EnumType.STRING)
    private Raza raza;

    //@Enumerated(EnumType.STRING)
    private Genero genero;

    @PastOrPresent
    private LocalDate fechaNacimiento;

    public enum Raza {
        DALMATA, CANICHE, LABRADOR, BRETON, CHIHUAHUA
    }

    public enum Genero {
        HEMBRA, MACHO
    }

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JsonIgnore
    // @JsonManagedReference
    private Cliente cliente;

    

}
