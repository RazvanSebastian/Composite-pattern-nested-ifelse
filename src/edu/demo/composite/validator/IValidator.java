package edu.demo.composite.validator;

public interface IValidator<I> {

    boolean validate(I value);
}
