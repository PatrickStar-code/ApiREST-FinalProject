package dio.ApiREST_FinalProject.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import dio.ApiREST_FinalProject.domain.User;
import dio.ApiREST_FinalProject.repository.UserRepository;
import dio.ApiREST_FinalProject.service.UserService;
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(long id) {
        // TODO Auto-generated method stub
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User creatUser(User user) {
        // TODO Auto-generated method stub
        if (userRepository.existsByAccountNumber(user.getAccount().getNumber())) {
            // Lógica a ser executada se o ID não for nulo e o usuário existir
            throw new IllegalArgumentException("Ja existe um usuario com esse numero de conta");

        }
        return userRepository.save(user);
    }

}