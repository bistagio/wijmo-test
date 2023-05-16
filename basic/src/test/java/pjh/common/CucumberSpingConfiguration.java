package pjh.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import pjh.BasicApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { BasicApplication.class })
public class CucumberSpingConfiguration {}
