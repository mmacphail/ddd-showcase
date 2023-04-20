package com.example.dddshowcase.resources.domain.model;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ResourceRepository extends CrudRepository<Resource, UUID> {
}
