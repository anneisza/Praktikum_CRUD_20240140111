package com.deploy.praktikum1.util;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ValidationUtil {

    @Autowired
    private Validator validator;

    public void validate(Object request) {
        Set<ConstraintViolation<Object>> constraintViolations = validator.validate(request);
        if (ConstraintViolations.size() != 0) {
            throw  new ConstraintViolationException(constraintViolations);
        }
    }
}

