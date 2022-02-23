package edu.demo.composite;

import edu.demo.composite.model.Degree;
import edu.demo.composite.model.Department;
import edu.demo.composite.model.Employee;
import edu.demo.composite.model.JobPosition;
import edu.demo.composite.validator.ValidatorsFactory;

public class Main {

    public static void main(String[] args) {
        Employee internship = new Employee(0, Department.INTERNSHIP_DEPARTMENT, Degree.STUDENT);
        System.out.println("Is internship = " + ValidatorsFactory.jobPositionValidators.get(JobPosition.INTERNSHIP).validate(internship));

        Employee junior = new Employee(1, Department.EMPLOYEE_DEPARTMENT, Degree.BACHELOR_DEGREE);
        System.out.println("Is junior = " + ValidatorsFactory.jobPositionValidators.get(JobPosition.JUNIOR).validate(junior));

        Employee mid = new Employee(4, Department.EMPLOYEE_DEPARTMENT, Degree.BACHELOR_DEGREE);
        System.out.println("Is mid = " + ValidatorsFactory.jobPositionValidators.get(JobPosition.MID).validate(mid));

        Employee senior = new Employee(10, Department.EMPLOYEE_DEPARTMENT, Degree.BACHELOR_DEGREE);
        System.out.println("Is senior = " + ValidatorsFactory.jobPositionValidators.get(JobPosition.SENIOR).validate(senior));
    }
}
