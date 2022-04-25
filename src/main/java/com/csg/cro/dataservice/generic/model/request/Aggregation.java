package com.csg.cro.dataservice.generic.model.request;

import lombok.Data;

@Data
public class Aggregation {
    String columnName;
    AggregationType aggregationType;
}
