package com.bojie.smellslikebakin;

/**
 * Created by bjiang on 4/3/16.
 */
public class IngredientsFragment extends CheckBoxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.ingredients[index].split("`");
    }
}
