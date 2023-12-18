package com.cj;

import com.cj.bean.Guest;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Path;
import jakarta.validation.Validation;
import jakarta.validation.Validator;

import java.util.Set;

public class TestGuest {

    public static void main(String[] args) {
        // 普通模式-全部错误都加载出来
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        // fastFail遇到一个错误就停止
        Validator validatorFastFail = Validation.byDefaultProvider().configure().addProperty("hibernate.validator.fail_fast", "true").buildValidatorFactory().getValidator();


        Guest guest = new Guest("","");
        Set<ConstraintViolation<Guest>> validate = validator.validate(guest);

        for (ConstraintViolation<Guest> constraintViolation : validate) {
            String message = constraintViolation.getMessage();
            Path propertyPath = constraintViolation.getPropertyPath();
            System.out.println(propertyPath+ "----"+message);  // role----不能为空   name----不能为空
        }

        System.out.println("====================");
        Set<ConstraintViolation<Guest>> validate1 = validatorFastFail.validate(guest);

        for (ConstraintViolation<Guest> constraintViolation : validate1) {
            String message = constraintViolation.getMessage();
            Path propertyPath = constraintViolation.getPropertyPath();
            System.out.println(propertyPath+ "----"+message);  // role----不能为空
        }
    }

}
