package com.bojie.smellslikebakin;

/**
 * Created by bjiang on 4/3/16.
 */
public class DirectionsFragment extends CheckBoxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.directions[index].split("`");
    }
}
