package com.trupti.projects;


import com.trupti.projects.exceptions.InvalidInputException;

public interface SearchProjectCatalogue{

    String[] findProjectBy(String str) throws InvalidInputException;



}
