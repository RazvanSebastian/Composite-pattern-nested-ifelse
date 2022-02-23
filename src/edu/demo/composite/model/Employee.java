package edu.demo.composite.model;

public class Employee {

    private Integer yearsOfExperience;
    private Department department;
    private Degree degree;

    public Employee(Integer yearsOfExperience, Department department, Degree degree) {
        this.yearsOfExperience = yearsOfExperience;
        this.department = department;
        this.degree = degree;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }
}
