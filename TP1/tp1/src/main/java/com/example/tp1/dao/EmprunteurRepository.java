package com.example.tp1.dao;
import com.example.tp1.entity.Emprunteur;

import org.springframework.data.jpa.repository.JpaRepository;
public interface EmprunteurRepository extends JpaRepository<Emprunteur, Long> {
}