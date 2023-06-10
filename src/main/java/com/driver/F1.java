package com.driver;

public class F1 extends Car {

    public F1(){

    }

    public F1(String name, boolean isManual) {
        super(name , 4 ,4 ,6, isManual,"f1" , 4);
        //Use arbitrary values for parameters which are not mentioned
    }

    public void accelerate(int rate){
//        int newSpeed = 0;
//        newSpeed+=rate;
        int newSpeed = this.getCurrentSpeed() + rate;
        //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed <= 0) {
            changeGear(1);
            stop();
            //Stop the car, set gear as 1
        } else if (newSpeed<=50) {
            changeGear(1);
        } else if (newSpeed<=100) {
            changeGear(2);
        }else if (newSpeed<=150) {
            changeGear(3);
        }else if (newSpeed<=200) {
            changeGear(4);
        }else if (newSpeed<=250) {
            changeGear(5);
        }else{
            changeGear(6);
        }

//        changeGear((newSpeed+49)/50);
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, this.getCurrentDirection());
        }
    }
}
