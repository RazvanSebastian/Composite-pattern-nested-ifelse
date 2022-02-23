package edu.demo.composite.validator;

import edu.demo.composite.model.Degree;
import edu.demo.composite.model.Department;
import edu.demo.composite.model.JobPosition;
import edu.demo.composite.validator.jobPosition.DegreeValidator;
import edu.demo.composite.validator.jobPosition.DepartmentValidator;
import edu.demo.composite.validator.jobPosition.ExperienceValidator;
import edu.demo.composite.validator.jobPosition.JobPositionValidator;

import java.util.HashMap;
import java.util.Map;

public final class ValidatorsFactory {

    public static final Map<JobPosition, IValidator> jobPositionValidators;

    static {
        jobPositionValidators = new HashMap<>();
        setJobPositionValidators();
    }

    private static void setJobPositionValidators() {
        JobPositionValidator internshipValidator = new DepartmentValidator(Department.INTERNSHIP_DEPARTMENT,
                new DegreeValidator(Degree.STUDENT,
                        new ExperienceValidator(0, 0)));
        internshipValidator.setJobPosition(JobPosition.INTERNSHIP);

        JobPositionValidator juniorValidator = new DepartmentValidator(Department.EMPLOYEE_DEPARTMENT,
                new DegreeValidator(Degree.BACHELOR_DEGREE,
                        new ExperienceValidator(0, 2)));
        juniorValidator.setJobPosition(JobPosition.JUNIOR);

        JobPositionValidator midValidator = new DepartmentValidator(Department.EMPLOYEE_DEPARTMENT,
                new DegreeValidator(Degree.BACHELOR_DEGREE,
                        new ExperienceValidator(2, 5)));
        midValidator.setJobPosition(JobPosition.MID);

        JobPositionValidator seniorValidator = new DepartmentValidator(Department.EMPLOYEE_DEPARTMENT,
                new DegreeValidator(Degree.BACHELOR_DEGREE,
                        new ExperienceValidator(5, 10)));
        seniorValidator.setJobPosition(JobPosition.SENIOR);

        jobPositionValidators.put(JobPosition.INTERNSHIP, internshipValidator);
        jobPositionValidators.put(JobPosition.JUNIOR, juniorValidator);
        jobPositionValidators.put(JobPosition.MID, midValidator);
        jobPositionValidators.put(JobPosition.SENIOR, seniorValidator);
    }
}
