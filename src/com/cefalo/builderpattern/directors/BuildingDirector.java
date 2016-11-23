package com.cefalo.builderpattern.directors;

import com.cefalo.builderpattern.builders.BuildingBuilder;


/**
 * Created by Raquibul on 11/23/2016.
 */
public abstract class BuildingDirector
{
    public abstract void construct(BuildingBuilder builder);
}
