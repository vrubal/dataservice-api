package com.csg.cro.dataservice.generic.model.request;

import lombok.Data;

import java.util.List;

@Data
public class Filter {
    String columnName;
    FilterType filterType;
    List<String> values;
}
