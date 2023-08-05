package com.uce.ejerciciou3_pw_api_p4_ec.service.dto;

import java.io.Serializable;

import org.springframework.hateoas.RepresentationModel;

public class VehiculoTo extends RepresentationModel<VehiculoTo> implements Serializable {

    public static final long serializableUI = 1L;

    private Integer id;

    private String placa;

    private String marca;

    private String anio;

    private String color;

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
