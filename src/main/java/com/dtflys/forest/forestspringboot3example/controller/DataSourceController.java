package com.dtflys.forest.forestspringboot3example.controller;

import com.dtflys.forest.forestspringboot3example.client.DataSourceRemoteClient;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DataSourceController {

    @Resource
    DataSourceRemoteClient dataSourceRemoteClient;

    @GetMapping("/data/dataSourceQuery")
    public Object dataSourceQuery() {
        Object result = dataSourceRemoteClient.queryDataSourceListPaging(1,10,"fcb7b95f778d88bc1d986eeec034a62a");
        return result;
    }

}
