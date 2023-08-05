package com.uce.ejerciciou3_pw_api_p4_ec.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.uce.ejerciciou3_pw_api_p4_ec.repository.entidad.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class VehiculoRepositoryImpl implements IVehiculoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Vehiculo> consultarTodos() {

        var a = this.entityManager.createQuery("SELECT v FROM Vehiculo v ", Vehiculo.class);

        return a.getResultList();
    }

    @Override
    public Vehiculo consultarPorPlaca(String placa) {

        var v = this.entityManager.createQuery("SELECT a FROM Vehiculo a WHERE a.placa =: datoPlaca", Vehiculo.class);

        v.setParameter("datoPlaca", placa);

        return v.getSingleResult();

    }

}
