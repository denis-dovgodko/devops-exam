package com.testapp.testapp.calc;

import com.sun.jdi.IntegerValue;

import javax.management.InvalidAttributeValueException;

public class Progression {
    private int sum=0;
    private int current_value=2;
    private int delta=3;
    private int items_quantity;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public int getItems_quantity() {
        return items_quantity;
    }

    public void setItems_quantity(int items_quantity) {
        this.items_quantity = items_quantity;
    }

    public Progression(int items_quantity) {
        this.items_quantity = items_quantity;
    }
    public int CalcSumm(){
        if(this.items_quantity!=0){
            for (int i = 0; i < items_quantity; i++) {
                this.sum += current_value;
                this.current_value += 3;
            }
            return this.sum;
        }
        else return 0;
    }
}
