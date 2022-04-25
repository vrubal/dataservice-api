package com.csg.cro.dataservice.generic.model.request;

import lombok.Data;

import java.util.List;

@Data
public class QueryData {
    private List<String> columns;
    private List<Filter> filters;
    private List<Sort> sort;
    private List<Join> joins;
    private List<String> groups;
    private List<Aggregation> aggregations;
}
