package com.uce.ejerciciou3_pw_api_p4_ec.repository.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehi_seq_id")
    @SequenceGenerator(name = "vehi_seq_id", sequenceName = "vehi_seq_id", allocationSize = 1)
    private Integer id;

    @Column(name = "vehi_placa")
    private String placa;

    @Column(name = "vehi_marca")
    private String marca;

    @Column(name = "vehi_anio")
    private String anio;

    @Column(name = "vehi_color")
    private String color;

    // set and get
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
