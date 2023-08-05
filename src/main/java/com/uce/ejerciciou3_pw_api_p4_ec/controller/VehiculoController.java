package com.uce.ejerciciou3_pw_api_p4_ec.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uce.ejerciciou3_pw_api_p4_ec.repository.entidad.Vehiculo;
import com.uce.ejerciciou3_pw_api_p4_ec.service.VehiculoServiceImpl;
import com.uce.ejerciciou3_pw_api_p4_ec.service.dto.VehiculoTo;

@RequestMapping("/vehiculos")
@RestController
public class VehiculoController {

    @Autowired
    private VehiculoServiceImpl vehiculoServiceImpl;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Vehiculo>> buscarTodos() {

        List<Vehiculo> list = this.vehiculoServiceImpl.consultarTodos();

        return new ResponseEntity<List<Vehiculo>>(list, null, 200);
    }

    @GetMapping(path = "/{placa}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<VehiculoTo> buscarPorPlaca(@PathVariable String placa) {
        var ls = this.vehiculoServiceImpl.consultarPorPlaca(placa);

        return new ResponseEntity<VehiculoTo>(ls, null, 200);
    }

}
