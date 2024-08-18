package org.example;

import java.util.ArrayList;
import java.util.List;

interface Employee{
    void showDetails();
}

class Developer implements Employee{

    private final String name;
    private final String position;

    public Developer(String name, String position){
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println("Developer: " + name + "Position: " + position);
    }
}

class Manager implements Employee{

    private final String name;
    private List<Employee> team = new ArrayList<>();

    public Manager(String name, String position){
        this.name = name;
    }

    public void addEmployeeToTheTeam(Employee emp){
        team.add(emp);
    }

    public void removeEmployeeFromTheTeam(Employee emp){
        team.remove(emp);
    }

    @Override
    public void showDetails() {
        System.out.println("Manager: " + name);
        System.out.println("Team: ");
        for(Employee emp: team){
            emp.showDetails();
        }
    }
}