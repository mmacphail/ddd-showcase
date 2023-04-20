package com.example.dddshowcase.resource.domain.model;

import com.example.dddshowcase.resources.domain.model.Resource;
import com.example.dddshowcase.resources.domain.model.ResourceRepository;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class ResourceRepositoryTests {

    @Autowired
    ResourceRepository resourceRepository;

    @Test
    void it_can_save_a_resource() {
        Resource resource = TestFixtures.getResource();
        resourceRepository.save(resource);

        Optional<Resource> foundResource = resourceRepository.findById(resource.getId());
        assertTrue(foundResource.isPresent());
        assertEquals(resource, foundResource.get());
    }

}
