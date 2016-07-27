package com.eandh;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by localadmin on 7/27/16.
 */
public class House implements Cost {
    private String name;
    private ArrayList<Room> Rooms;

    public House(String name) {
        this.name = name;
        this.Rooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void AddRoom(Room r)
    {
        boolean roomexist = false;

        Iterator<Room> iterator = Rooms.iterator();
        while(iterator.hasNext())
        {
            Room s = iterator.next();
            if (s.getName() == name) {
                roomexist = true;
                break;
            }
        }

        if( !roomexist)
        {
            Rooms.add(r);
        }
    }

    public void RemoveRoom(String name)
    {
        Iterator<Room> iterator = Rooms.iterator();
        while(iterator.hasNext())
        {
            Room s = iterator.next();
            if (s.getName() == name) {
                iterator.remove();
            }
        }

    }

    @Override
    public double floorCost() {

        return Rooms.stream()
            .mapToDouble(Room::floorCost)
            .sum();
    }

    @Override
    public double paintCost() {
        return Rooms.stream()
                .mapToDouble(Room::paintCost)
                .sum();
    }
}
