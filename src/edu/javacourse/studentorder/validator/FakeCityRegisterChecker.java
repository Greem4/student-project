package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.CityRegisterCheckerResponse;
import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.exception.CityRegisterException;

public class FakeCityRegisterChecker implements CityRegisterChecker {

    public CityRegisterCheckerResponse checkPerson(Person person)
            throws CityRegisterException {
        if (person instanceof Adult) {
            System.out.println("ADULT");
        }
        return null;
    }
}
