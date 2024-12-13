package com.hotel.tp_reservation_rest.services;

import com.hotel.tp_reservation_rest.entities.Reservation;
import com.hotel.tp_reservation_rest.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation getReservation(Long id) {
        return reservationRepository.findById(id).orElseThrow(() -> new RuntimeException("Reservation not found"));
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Long id, Reservation newReservation) {
        Reservation existingReservation = getReservation(id);
        existingReservation.setDateDebut(newReservation.getDateDebut());
        existingReservation.setDateFin(newReservation.getDateFin());
        existingReservation.setPreferences(newReservation.getPreferences());
        return reservationRepository.save(existingReservation);
    }

    @Override
    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }
}