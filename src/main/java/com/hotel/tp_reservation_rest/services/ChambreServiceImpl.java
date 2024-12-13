package com.hotel.tp_reservation_rest.services;

import com.hotel.tp_reservation_rest.entities.Chambre;
import com.hotel.tp_reservation_rest.repositories.ChambreRepository;
import com.hotel.tp_reservation_rest.services.ChambreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChambreServiceImpl implements ChambreService {
    @Autowired
    private ChambreRepository chambreRepository;

    @Override
    public Chambre createChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre getChambreById(Long id) {
        return chambreRepository.findById(id).orElseThrow(() -> new RuntimeException("Chambre not found with id: " + id));
    }

    @Override
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre updateChambre(Long id, Chambre chambre) {
        Chambre existingChambre = getChambreById(id);
        existingChambre.setTypeChambre(chambre.getTypeChambre());
        existingChambre.setPrix(chambre.getPrix());
        existingChambre.setDisponible(chambre.isDisponible());
        return chambreRepository.save(existingChambre);
    }

    @Override
    public void deleteChambre(Long id) {
        chambreRepository.deleteById(id);
    }
}
