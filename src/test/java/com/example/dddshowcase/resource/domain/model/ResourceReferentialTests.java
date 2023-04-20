package com.example.dddshowcase.resource.domain.model;

import com.example.dddshowcase.resources.domain.model.Resource;
import com.example.dddshowcase.resources.domain.model.ResourceReferential;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class ResourceReferentialTests {

    @Test
    void it_can_onboard_a_resource() {
        ResourceReferential referential = TestFixtures.getResourceReferential();
        Resource resource = referential.onboard();
        assertNotNull(resource.getId());
        assertEquals(resource.getResourceReferentialId(), referential.getId());
        assertEquals(referential.getName(), resource.getName());
        assertFalse(resource.isActive());
    }

}
