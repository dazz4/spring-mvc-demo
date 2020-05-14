package com.springmvc.demo.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeContraintValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD } )
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    // define default course code
    String value() default "LUV";

    // define default error message
    String message() default "must start with LUV";

    // define default group
    Class<?>[] groups() default {};

    // define default payloads
    Class<? extends Payload>[] payload() default {};
}
