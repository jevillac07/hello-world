package com.jevillac07.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
  private static final String template = "Hello, %s!";

  @GetMapping("/greeting")
  public String greeting(@RequestParam(value = "value", defaultValue = "World") String value) {
    return String.format(template, value);
  }
}
