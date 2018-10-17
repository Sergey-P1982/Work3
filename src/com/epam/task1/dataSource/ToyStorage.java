package com.epam.task1.dataSource;

import com.epam.task1.entities.Constructor;
import com.epam.task1.entities.ElectricalCar;
import com.epam.task1.entities.SoftToy;
import com.epam.task1.entities.Toy;

public class ToyStorage {
    public static Toy[] getToys() {

        return new Toy[]{new Constructor("Lego1", "plastic", 50.1, 1.5,
                50), new Constructor("Lego2", "wood", 25.5, 0.5,
                20), new Constructor("Lego3", "metal", 10.1, 0.7,
                25), new SoftToy("Teddy bear", "velvet", 5.0, 0.1, 300),
                 new SoftToy("Barbie", "plastic", 12.0, 0.05, 250),
                 new ElectricalCar("Police car", "plastic", 20.0, 0.2, 1),
                 new ElectricalCar("Jeep", "plastic", 18.0, 0.5, 4),
                 new ElectricalCar("Racer", "plastic", 25.0, 0.4, 2)
        };
    }
}
