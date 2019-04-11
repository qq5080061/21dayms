package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjecto2l2 {

        Projecto2l2Delegate projecto2l2Delegate = new Projecto2l2Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projecto2l2Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}