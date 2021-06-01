package kovteba.service;

import kovteba.persistance.entity.Status;

public interface UserService {

    Integer getUsersByStatus(Status status);

}
