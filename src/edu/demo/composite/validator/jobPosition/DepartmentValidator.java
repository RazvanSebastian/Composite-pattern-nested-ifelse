package edu.demo.composite.validator.jobPosition;

import edu.demo.composite.model.Department;
import edu.demo.composite.model.Employee;
import edu.demo.composite.validator.IValidator;

public class DepartmentValidator extends JobPositionValidator {

    private Department department;

    public DepartmentValidator(Department department, IValidator<Employee> nextValidator) {
        super(nextValidator);
        this.department = department;
    }

    @Override
    public boolean validate(Employee value) {
        return this.department.equals(value.getDepartment()) && nextValidator.validate(value);
    }
}
