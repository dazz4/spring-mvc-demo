package com.springmvc.demo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeContraintValidator implements ConstraintValidator<CourseCode, String> {

   public String coursePrefix;

   public void initialize(CourseCode theCourseCode) {
      coursePrefix = theCourseCode.value();
   }

   public boolean isValid(String theCode, ConstraintValidatorContext context) {

      boolean result;

      if (theCode != null) {
         result = theCode.startsWith(coursePrefix);
      } else {
         result = true;
      }

      return result;
   }
}
