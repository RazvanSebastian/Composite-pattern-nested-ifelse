package edu.demo.composite.validator.jobPosition;

import edu.demo.composite.model.Degree;
import edu.demo.composite.model.Employee;
import edu.demo.composite.validator.IValidator;

public class DegreeValidator extends JobPositionValidator {

    private Degree degree;

    public DegreeValidator(Degree degree, IValidator<Employee> nextValidator) {
        super(nextValidator);
        this.degree = degree;
    }

    @Override
    public boolean validate(Employee value) {
        return degree.equals(value.getDegree()) && nextValidator.validate(value);
    }
}
