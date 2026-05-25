package com.dtflys.forest.forestspringboot3example.client;

import com.dtflys.forest.annotation.*;
import com.dtflys.forest.forestspringboot3example.model.Location;
import com.dtflys.forest.forestspringboot3example.model.Result;

/**
 * 高德地图服务客户端接口
 * @author gongjun
 */
@BaseRequest(baseURL = "http://localhost:12345/dolphinscheduler")
public interface DataSourceRemoteClient {



    @Get("/datasources?pageNo={pageNo}&pageSize={pageSize}")
    Object queryDataSourceListPaging(@Var("pageNo") int longitude, @Var("pageSize") int pageSize,@Header("token") String token);



}
