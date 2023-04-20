package com.example.dddshowcase.resource.application;

import com.example.dddshowcase.resource.domain.model.TestFixtures;
import com.example.dddshowcase.resources.application.ResourceReferentialApi;
import com.example.dddshowcase.resources.domain.model.Resource;
import com.example.dddshowcase.resources.domain.model.ResourceReferentialRepository;
import com.example.dddshowcase.resources.domain.model.ResourceRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.mockito.Mockito.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class ResourceReferentialApiTests {

    private ResourceReferentialRepository resourceReferentialRepository;
    private ResourceRepository resourceRepository;
    private ResourceReferentialApi resourceReferentialApi;

    @BeforeEach
    void setUp() {
        resourceReferentialRepository = mock(ResourceReferentialRepository.class);
        resourceRepository = mock(ResourceRepository.class);
        resourceReferentialApi = new ResourceReferentialApi(resourceReferentialRepository, resourceRepository);
    }

    @Test
    void it_can_onboard_a_resource() {
        var resourceReferential = TestFixtures.getResourceReferential();
        when(resourceReferentialRepository.findById(resourceReferential.getId())).thenReturn(Optional.of(resourceReferential));

        resourceReferentialApi.onboardResource(resourceReferential.getId());

        verify(resourceRepository).save(any(Resource.class));
    }

}
