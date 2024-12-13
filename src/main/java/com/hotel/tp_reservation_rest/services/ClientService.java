package com.hotel.tp_reservation_rest.services;

import com.hotel.tp_reservation_rest.entities.Client;

import java.util.List;

public interface ClientService {
    Client createClient(Client client);
    Client getClientById(Long id);
    List<Client> getAllClients();
    Client updateClient(Long id, Client client);
    void deleteClient(Long id);
}
