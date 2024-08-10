package com.ikafa.taco_cloud.entities;

import com.ikafa.taco_cloud.enums.Type;

import lombok.Data;

@Data
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;
}
