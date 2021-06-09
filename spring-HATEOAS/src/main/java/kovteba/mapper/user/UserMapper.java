package src.main.java.kovteba.mapper.user;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import src.main.java.kovteba.model.user.UserModel;
import src.main.java.kovteba.persistance.user.entity.UserEntity;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface UserMapper {

    UserModel entityToModel(UserEntity entity);

    UserEntity modelToEntity(UserModel model);

}
