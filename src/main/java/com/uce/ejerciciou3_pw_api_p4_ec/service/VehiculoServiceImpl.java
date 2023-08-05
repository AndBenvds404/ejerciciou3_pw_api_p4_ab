package com.uce.ejerciciou3_pw_api_p4_ec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.ejerciciou3_pw_api_p4_ec.repository.VehiculoRepositoryImpl;
import com.uce.ejerciciou3_pw_api_p4_ec.repository.entidad.Vehiculo;
import com.uce.ejerciciou3_pw_api_p4_ec.service.dto.VehiculoTo;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

    @Autowired
    private VehiculoRepositoryImpl vehiculoRepositoryImpl;

    @Override
    public List<Vehiculo> consultarTodos() {

        return this.vehiculoRepositoryImpl.consultarTodos();

    }

    @Override
    public VehiculoTo consultarPorPlaca(String placa) {
        Vehiculo v = this.vehiculoRepositoryImpl.consultarPorPlaca(placa);
        VehiculoTo vto = this.convertir(v);
        return vto;

    }

    public VehiculoTo convertir(Vehiculo v) {

        VehiculoTo vto = new VehiculoTo();
        vto.setId(v.getId());
        vto.setPlaca(v.getPlaca());
        vto.setAnio(v.getAnio());
        vto.setColor(v.getColor());
        vto.setMarca(v.getMarca());

        return vto;
    }

}
