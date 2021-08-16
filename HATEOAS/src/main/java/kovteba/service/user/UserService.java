package src.main.java.kovteba.service.user;

import src.main.java.kovteba.persistance.user.entity.UserEntity;

import java.util.List;

public interface UserService {

    UserEntity createUser(UserEntity entity);

    void deleteUserById(Long id);

    UserEntity getUserById(Long id);

    UserEntity updateUser(Long id, UserEntity userEntity);

    List<UserEntity> getAllUsers();
}
