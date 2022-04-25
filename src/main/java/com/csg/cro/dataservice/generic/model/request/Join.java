package com.csg.cro.dataservice.generic.model.request;

import lombok.Data;

@Data
public class Join {
    private String dataset;
    private String columnName;
}
