package com.educandoweb.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id) {
        super("Could not find resource with id " + id);
    }
}
