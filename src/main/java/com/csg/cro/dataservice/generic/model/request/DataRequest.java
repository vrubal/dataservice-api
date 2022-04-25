package com.csg.cro.dataservice.generic.model.request;

import lombok.Data;

@Data
public class DataRequest {
    private Page page;
    private String datasetName;
    private DatasetType type;
    private QueryData queryData;
}
