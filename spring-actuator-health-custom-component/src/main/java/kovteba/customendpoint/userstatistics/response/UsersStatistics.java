package kovteba.customendpoint.userstatistics.response;

import kovteba.persistance.entity.Status;
import lombok.Data;

import java.util.HashMap;

@Data
public class UsersStatistics {

    private HashMap<Status, Integer> statistics;

}
