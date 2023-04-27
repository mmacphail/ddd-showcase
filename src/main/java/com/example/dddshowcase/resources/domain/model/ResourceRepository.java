package com.example.dddshowcase.resources.domain.model;

import com.example.dddshowcase.ddd.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ResourceRepository extends CrudRepository<Resource, UUID>, Repository {
}
