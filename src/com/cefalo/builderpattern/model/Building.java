package com.cefalo.builderpattern.model;

/**
 * Created by Raquibul on 11/23/2016.
 */
public class Building
{

    String floors;
    String windows;
    String walls;
    String rooms;
    String painted;
    String name;
    String doors;


    public String getFloors()
    {
        return floors;
    }


    public void setFloors(String floors)
    {
        this.floors = floors;
    }


    public String getWindows()
    {
        return windows;
    }


    public void setWindows(String windows)
    {
        this.windows = windows;
    }


    public String getWalls()
    {
        return walls;
    }


    public void setWalls(String walls)
    {
        this.walls = walls;
    }


    public String getRooms()
    {
        return rooms;
    }


    public void setRooms(String rooms)
    {
        this.rooms = rooms;
    }


    public String getPainted()
    {
        return painted;
    }


    public void setPainted(String painted)
    {
        this.painted = painted;
    }


    public String getName()
    {
        return name;
    }


    public void setName(String name)
    {
        this.name = name;
    }


    public String getDoors()
    {
        return doors;
    }


    public void setDoors(String doors)
    {
        this.doors = doors;
    }


    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Building{");
        sb.append("floors='").append(floors).append('\'');
        sb.append(", windows='").append(windows).append('\'');
        sb.append(", walls='").append(walls).append('\'');
        sb.append(", rooms='").append(rooms).append('\'');
        sb.append(", painted='").append(painted).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", doors='").append(doors).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
