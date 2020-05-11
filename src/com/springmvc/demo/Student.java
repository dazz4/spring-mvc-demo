package com.springmvc.demo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String language;
    private String[] systems;
    private LinkedHashMap<String, String> countryOptions;
    private List<String> favoriteLanguages;

    public Student() {
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("PL", "Poland");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("UK", "United Kingdom");

        favoriteLanguages = new ArrayList<>();
        favoriteLanguages.add("JavaScript");
        favoriteLanguages.add("Java");
        favoriteLanguages.add("C++");

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public List<String> getFavoriteLanguages() {
        return favoriteLanguages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String[] getSystems() {
        return systems;
    }

    public void setSystems(String[] systems) {
        this.systems = systems;
    }
}
