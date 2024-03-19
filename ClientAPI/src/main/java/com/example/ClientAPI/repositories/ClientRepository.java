package com.example.ClientAPI.repositories;

import com.example.ClientAPI.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
