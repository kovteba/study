package kovteba.customendpoint.userstatistics.endpoint;

import kovteba.customendpoint.userstatistics.response.UsersStatistics;
import kovteba.persistance.entity.Status;
import kovteba.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@Endpoint(id = "users-stat")
@RequiredArgsConstructor
public class UserStatisticsEndpoint {

    private final UserService userService;

    @ReadOperation
    public UsersStatistics userStatistics(){
        var usersStatistics = new UsersStatistics();
        HashMap<Status, Integer> stat = new HashMap<>();
        stat.put(Status.ACTIVE, userService.getUsersByStatus(Status.ACTIVE));
        stat.put(Status.LOCKED, userService.getUsersByStatus(Status.LOCKED));
        usersStatistics.setStatistics(stat);
        return usersStatistics;
    }
}
