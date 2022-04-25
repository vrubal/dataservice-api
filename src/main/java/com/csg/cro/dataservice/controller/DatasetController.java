package com.csg.cro.dataservice.controller;

import com.csg.cro.dataservice.generic.model.request.DataRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Log4j2
@RestController
public class DatasetController {

    @PostMapping(path = "/getData")
    public Map<String, String> getData(@RequestBody DataRequest request){
       log.info("Received request:{}", request);
       return null;
    }
}
