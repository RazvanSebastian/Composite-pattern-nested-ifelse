package edu.demo.composite.validator.jobPosition;

import edu.demo.composite.model.Employee;
import edu.demo.composite.model.JobPosition;
import edu.demo.composite.validator.IValidator;

public abstract class JobPositionValidator implements IValidator<Employee> {

    private JobPosition jobPosition;
    protected IValidator<Employee> nextValidator;

    public JobPositionValidator(IValidator<Employee> nextValidator) {
        this.nextValidator = nextValidator;
    }

    public void setJobPosition(JobPosition jobPosition) {
        this.jobPosition = jobPosition;
    }

    public JobPosition getJobPosition() {
        return jobPosition;
    }
}
