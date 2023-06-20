package br.com.testesmockito_junit.api.services.user.exceptions;

public class ObjectNotFoundException extends  RuntimeException{
    public ObjectNotFoundException(String message) {
        super(message);
    }
}
