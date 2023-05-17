package com.example.dddshowcase.resources.application;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class OnboardResourceCommand {
    UUID resourceReferentialId;
}
