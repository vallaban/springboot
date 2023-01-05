//package com.udemy.spring.springselenium.flights;
//
//import com.udemy.spring.springselenium.SpringBaseTestNgTest;
//import com.udemy.spring.springselenium.pages.flights.FlightPage;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class FlightTest extends SpringBaseTestNgTest {
//    @Autowired
//    private FlightPage flightPage;
//    @Autowired
//    private FlightAppDetails appDetails;
//
//    @Test
//    public void flightTest() {
//        this.flightPage.goTo(this.appDetails.getUrl());
//        System.out.println(this.flightPage.getLabels());
//        System.out.println(this.appDetails.getLabels());
//        Assert.assertEquals(this.flightPage.getLabels(), this.appDetails.getLabels());
//    }
//
//}