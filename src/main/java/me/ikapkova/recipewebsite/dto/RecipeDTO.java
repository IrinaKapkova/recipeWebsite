package me.ikapkova.recipewebsite.dto;

import lombok.Data;
import me.ikapkova.recipewebsite.model.Ingredient;
import me.ikapkova.recipewebsite.model.Recipe;


import java.util.List;

@Data
public class RecipeDTO {
    private final int id;
    private String recipeName;
    private int cookingTime;
    private final List<Ingredient> ingredients;
    private List<String> stepsOfCooking;

    public RecipeDTO(int id, String recipeName, int cookingTime, List<Ingredient> ingredients, List<String> stepsOfCooking) {
        this.id = id;
        this.recipeName = recipeName;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
        this.stepsOfCooking = stepsOfCooking;
    }

    public int getId() {
        return id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public List<String> getStepsOfCooking() {
        return stepsOfCooking;
    }

    public static RecipeDTO from(int id, Recipe recipe){
        return  new RecipeDTO(id, recipe.getRecipeName(), recipe.getCookingTime(), recipe.getIngredients(), recipe.getStepsOfCooking());
    }
}

