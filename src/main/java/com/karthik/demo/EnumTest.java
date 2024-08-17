package com.karthik.demo;

import java.util.Arrays;

enum CountryCode {
  GK("IN123"),
  PR("PR123");
  @lombok.Getter private final String countryCodes;

  CountryCode(String countryCode) {
    this.countryCodes = countryCode;
  }
}

public class EnumTest {

  public static void main(String[] args) {
    String cc =
        Arrays.stream(CountryCode.values())
            .filter(c -> c.name().equalsIgnoreCase("AB"))
            .findAny()
            .map(CountryCode::getCountryCodes)
            .orElse("XX");
    System.out.println(cc);
  }
}
