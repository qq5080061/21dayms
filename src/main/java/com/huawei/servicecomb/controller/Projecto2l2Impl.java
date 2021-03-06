package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-04-11T15:39:42.129Z")

@RestSchema(schemaId = "projecto2l2")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Projecto2l2Impl {

    @Autowired
    private Projecto2l2Delegate userProjecto2l2Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjecto2l2Delegate.helloworld(name);
    }

}
