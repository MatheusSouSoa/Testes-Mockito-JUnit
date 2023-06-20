package br.com.testesmockito_junit.api.repositories;


import br.com.testesmockito_junit.api.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
