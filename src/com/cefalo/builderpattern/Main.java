package com.cefalo.builderpattern;

import com.cefalo.builderpattern.builders.BuildingBuilder;
import com.cefalo.builderpattern.builders.SingleStoryBuilder;
import com.cefalo.builderpattern.builders.ThreeStoryBuilder;
import com.cefalo.builderpattern.directors.BuildingDirector;
import com.cefalo.builderpattern.directors.MultiGlassBuildingDirector;
import com.cefalo.builderpattern.directors.SingleStoryBuildingDirector;


public class Main
{

    public static void main(String[] args)
    {
        // write your code here
        BuildingBuilder buildingBuilder = new SingleStoryBuilder();
        BuildingDirector buildingDirector = new SingleStoryBuildingDirector();
        buildingDirector.construct(buildingBuilder);
        System.out.println(buildingBuilder.getBuilding().toString());

        BuildingBuilder buildingBuilder1 = new ThreeStoryBuilder();
        BuildingDirector buildingDirector1 = new MultiGlassBuildingDirector();
        buildingDirector1.construct(buildingBuilder1);
        System.out.println(buildingBuilder1.getBuilding().toString());
    }
}
