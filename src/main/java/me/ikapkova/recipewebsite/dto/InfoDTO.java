package me.ikapkova.recipewebsite.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDate;
@Data
public class InfoDTO {
    private final String author;
    private final String name;
    private final LocalDate creationDate;

    private final String description;
}
