package src.main.java.kovteba.service.user.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import src.main.java.kovteba.persistance.user.entity.UserEntity;
import src.main.java.kovteba.persistance.user.repository.UserRepository;
import src.main.java.kovteba.service.user.UserService;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserEntity createUser(UserEntity entity) {
        return userRepository.save(entity);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserEntity getUserById(Long id) {
        return userRepository.getById(id);
    }

    @Override
    public UserEntity updateUser(Long id, UserEntity userEntity) {

        var userFromDb = userRepository.findById(id).orElseThrow();

        userEntity.setId(userFromDb.getId());

        return userRepository.save(userEntity);
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }
}
