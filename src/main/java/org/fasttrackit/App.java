package org.fasttrackit;

public class App {
    public static void main( String[] args )
    {
      Race race = new Race();

      RadioControlledCar dacia = new RadioControlledCar();

      dacia.name = "Dacia";
      dacia.color = "red";
      dacia.doorCount = 2;
      dacia.wheelCount = 4;
      dacia.mileage = 8.5;

      Engine engine = new Engine();
      engine.manufacturer = "Renault";

      dacia.engine = engine;

      RadioControlledCar lada = new RadioControlledCar();

      lada.name = "Lada";
      lada.color = "orange";
      lada.wheelCount = 4;
      lada.doorCount = 4;
      lada.mileage = 8.1;

      Engine ladaEngine = new Engine();
      ladaEngine.manufacturer = "Lada";
      lada.engine = ladaEngine;

      race.firstCar = dacia;
      race.secondCar =lada;
      Vehicle vehicle = new Vehicle();
      vehicle.accelerate(20.1 );
    }
}
