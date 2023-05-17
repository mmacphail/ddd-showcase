package com.example.dddshowcase.resources.domain.model;

import com.example.dddshowcase.ddd.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ResourceRepository extends JpaRepository<Resource, UUID>, Repository {
}
