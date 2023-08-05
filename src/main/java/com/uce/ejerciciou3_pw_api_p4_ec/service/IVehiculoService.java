package com.uce.ejerciciou3_pw_api_p4_ec.service;

import java.util.List;

import com.uce.ejerciciou3_pw_api_p4_ec.repository.entidad.Vehiculo;
import com.uce.ejerciciou3_pw_api_p4_ec.service.dto.VehiculoTo;

public interface IVehiculoService {

    public List<Vehiculo> consultarTodos();

    public VehiculoTo consultarPorPlaca(String placa);
}
