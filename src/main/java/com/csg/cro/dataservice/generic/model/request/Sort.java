package com.csg.cro.dataservice.generic.model.request;

import lombok.Data;

@Data
public class Sort {
    String columnName;
    SortType sortType;
}
