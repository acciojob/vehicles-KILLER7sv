package com.driver.test;

import com.driver.Car;
import com.driver.F1;
import com.driver.Vehicle;
import org.junit.jupiter.api.Test;

public class TestCases {
    public TestCases() {
    }

    @Test
    public final void testVehicle() {
        Vehicle vehicle = new Vehicle("Truck");

        assert vehicle.getName() == "Truck";

        assert vehicle.getCurrentDirection() == 0;

        assert vehicle.getCurrentSpeed() == 0;

        vehicle.move(10, 45);

        assert vehicle.getCurrentSpeed() == 10;

        assert vehicle.getCurrentDirection() == 45;

        vehicle.steer(45);

        assert vehicle.getCurrentDirection() == 90;

        assert vehicle.getCurrentSpeed() == 10;

        vehicle.stop();

        assert vehicle.getCurrentSpeed() == 0;

    }

    @Test
    public final void testCar1() {
        Car car = new Car("Tata", 4, 4, 4, true, "Sedan" , 4);

        assert car.getName() == "Tata";

        assert car.getDoors() == 4;

        assert car.getGears() == 4;

        assert car.getWheels() == 4;

        assert car.isManual();

        assert car.getType() == "Sedan";

        assert car.getCurrentGear() == 1;

        car.changeSpeed(20, 30);

        assert car.getCurrentSpeed() == 20;

        assert car.getCurrentDirection() == 30;

        car.changeGear(3);

        assert car.getCurrentGear() == 3;

    }

    @Test
    public final void testCar2() {
        Car car = new Car("Tata", 4, 4, 4, true, "Sedan" , 4);
        car.move(20, 30);

        assert car.getCurrentSpeed() == 20;

        assert car.getCurrentDirection() == 30;

        car.steer(45);

        assert car.getCurrentDirection() == 75;

        assert car.getCurrentSpeed() == 20;

        car.stop();

        assert car.getCurrentSpeed() == 0;

    }

    @Test
    public final void testF11() {
        F1 f1 = new F1("BMW", false);

        assert f1.getName() == "BMW";

        assert !f1.isManual();

        f1.accelerate(0);

        assert f1.getCurrentSpeed() == 0;

        assert f1.getCurrentGear() == 1;

        f1.accelerate(50);

        assert f1.getCurrentSpeed() == 50;

        assert f1.getCurrentGear() == 1;

        f1.accelerate(25);

        assert f1.getCurrentSpeed() == 75;

        assert f1.getCurrentGear() == 2;

        f1.accelerate(50);

        assert f1.getCurrentSpeed() == 125;

        assert f1.getCurrentGear() == 3;

        f1.accelerate(26);

        assert f1.getCurrentSpeed() == 151;

        assert f1.getCurrentGear() == 4;

        f1.accelerate(99);

        assert f1.getCurrentSpeed() == 250;

        assert f1.getCurrentGear() == 5;

        f1.accelerate(1);

        assert f1.getCurrentSpeed() == 251;

        assert f1.getCurrentGear() == 6;

        assert f1.getCurrentDirection() == 0;

    }

    @Test
    public final void testF12() {
        F1 f1 = new F1("BMW", false);
        f1.move(100, 30);

        assert f1.getCurrentSpeed() == 100;

        assert f1.getCurrentDirection() == 30;

        f1.steer(60);

        assert f1.getCurrentDirection() == 90;

        assert f1.getCurrentSpeed() == 100;

        f1.stop();

        assert f1.getCurrentSpeed() == 0;

        f1.changeSpeed(30, 100);

        assert f1.getCurrentSpeed() == 30;

        assert f1.getCurrentDirection() == 100;
    }


}
