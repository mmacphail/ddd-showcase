package com.example.dddshowcase.resources.domain.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ResourceOwnerRepository extends JpaRepository<ResourceOwner, UUID> {
}
