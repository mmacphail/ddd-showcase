package com.example.dddshowcase.resource.domain.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ResourceReferentialRepository extends JpaRepository<ResourceReferential, UUID> {
}
