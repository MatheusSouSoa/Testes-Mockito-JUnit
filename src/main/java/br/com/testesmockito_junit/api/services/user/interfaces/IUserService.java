package br.com.testesmockito_junit.api.services.user.interfaces;

import br.com.testesmockito_junit.api.domain.User;

public interface IUserService {

    User findById(Long id);

}
