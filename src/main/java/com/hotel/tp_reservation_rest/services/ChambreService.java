package com.hotel.tp_reservation_rest.services;

import com.hotel.tp_reservation_rest.entities.Chambre;

import java.util.List;

public interface ChambreService {
    Chambre createChambre(Chambre chambre);
    Chambre getChambreById(Long id);
    List<Chambre> getAllChambres();
    Chambre updateChambre(Long id, Chambre chambre);
    void deleteChambre(Long id);
}
