package src.main.java.kovteba.advice;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import src.main.java.kovteba.model.user.UserModel;
import src.main.java.kovteba.processor.user.UserProcessor;

@Slf4j
@Aspect
@Component
@RequiredArgsConstructor
public class UserMapperAdvice {

    private final UserProcessor userProcessor;

    @AfterReturning(value = "execution(* src.main.java.kovteba.mapper.user.UserMapper.entityToModel(..))",
                    returning = "userModel")
    public UserModel addLinksToUserModel(JoinPoint joinPoint, UserModel userModel){

        log.debug("Advice for user model with ID: {}", userModel.getId());

        return userProcessor.process(userModel);
    }
}
