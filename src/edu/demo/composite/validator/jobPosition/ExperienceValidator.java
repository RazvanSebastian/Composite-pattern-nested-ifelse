package edu.demo.composite.validator.jobPosition;

import edu.demo.composite.model.Employee;

public class ExperienceValidator extends JobPositionValidator{
    private Integer minExp;
    private Integer maxExp;

    public ExperienceValidator(Integer minExp, Integer maxExp) {
        super(null);
        this.minExp = minExp;
        this.maxExp = maxExp;
    }

    @Override
    public boolean validate(Employee employee) {
        return (employee.getYearsOfExperience() >= minExp && employee.getYearsOfExperience() <= maxExp);
    }
}
