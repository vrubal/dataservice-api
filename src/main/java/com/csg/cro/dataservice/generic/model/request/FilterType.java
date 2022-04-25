package com.csg.cro.dataservice.generic.model.request;

public enum FilterType {
    GT(">"), LT("<"), EQ("="), IN("in"), GTE(">="), LTE("<=");
    String value;
    FilterType(String value){
        this.value=value;
    }
}
