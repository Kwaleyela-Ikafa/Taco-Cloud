package com.ikafa.taco_cloud.entities;

import java.util.List;

import lombok.Data;

@Data
public class Taco {
    private String name;
    private List<Ingredient> ingredients;
}
