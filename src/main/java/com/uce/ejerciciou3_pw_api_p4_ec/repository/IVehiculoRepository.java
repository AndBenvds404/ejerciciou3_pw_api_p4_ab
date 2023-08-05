package com.uce.ejerciciou3_pw_api_p4_ec.repository;

import java.util.List;

import com.uce.ejerciciou3_pw_api_p4_ec.repository.entidad.Vehiculo;

public interface IVehiculoRepository {

    public List<Vehiculo> consultarTodos();

    public Vehiculo consultarPorPlaca(String placa);

}
