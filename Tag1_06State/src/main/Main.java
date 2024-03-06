package main;

import business.BusinessObject;

public class Main {
    public static void main(String[] args) {


        BusinessObject businessObject = new BusinessObject();
        businessObject.drucken();
        businessObject.changeToB();
        businessObject.drucken();
        businessObject.changeToB();
    }
}