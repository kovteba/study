package src.main.java.kovteba.mapper.team;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import src.main.java.kovteba.model.team.TeamModel;
import src.main.java.kovteba.persistance.team.entity.TeamEntity;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface TeamMapper {

    TeamModel entityToModel(TeamEntity teamEntity);

    TeamEntity modelToEntity(TeamModel teamModel);

}
