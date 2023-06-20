package br.com.testesmockito_junit.api.services.user.impl;

import br.com.testesmockito_junit.api.domain.User;
import br.com.testesmockito_junit.api.repositories.UserRepository;
import br.com.testesmockito_junit.api.services.user.exceptions.ObjectNotFoundException;
import br.com.testesmockito_junit.api.services.user.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Long id) {
        Optional<User> obj= userRepository.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado."));
    }
}
