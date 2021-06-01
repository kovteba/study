package kovteba.service.impl;

import kovteba.persistance.entity.Status;
import kovteba.persistance.entity.User;
import kovteba.persistance.repository.UserRepository;
import kovteba.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Integer getUsersByStatus(Status status) {

        return userRepository.countAllByStatus(status);
    }
}
