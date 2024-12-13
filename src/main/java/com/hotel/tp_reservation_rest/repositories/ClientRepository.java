package com.hotel.tp_reservation_rest.repositories;

import com.hotel.tp_reservation_rest.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
