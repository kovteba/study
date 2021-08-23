package src.main.java.kovteba.controller.user;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;
import src.main.java.kovteba.mapper.user.UserMapper;
import src.main.java.kovteba.model.user.UserModel;
import src.main.java.kovteba.processor.user.UserProcessor;
import src.main.java.kovteba.service.user.UserService;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;
    private final UserProcessor userProcessor;

    @GetMapping("/{id}")
    public EntityModel<UserModel> getUserById(@PathVariable Long id) {

        var userEntity = userService.getUserById(id);

        return EntityModel.of(userMapper.entityToModel(userEntity));

    }

    @GetMapping("/all")
    public List<UserModel> getAllUsers() {

        return userService.getAllUsers().stream()
                                        .map(userMapper::entityToModel)
                                        .collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public EntityModel<UserModel> updateUser(@RequestBody UserModel userModel, @PathVariable Long id) {

        var userEntity = userMapper.modelToEntity(userModel);
        var updatedEntity = userService.updateUser(id, userEntity);

        return EntityModel.of(userMapper.entityToModel(updatedEntity));
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUserById(id);
    }
}

