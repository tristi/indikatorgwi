package com.shsb.indikatorgwi.cucumber.stepdefs;

import com.shsb.indikatorgwi.IndikatorGwiApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = IndikatorGwiApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
