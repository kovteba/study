package src.main.java.kovteba.advice;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import src.main.java.kovteba.model.team.TeamModel;
import src.main.java.kovteba.processor.team.TeamProcessor;
import src.main.java.kovteba.processor.user.UserProcessor;

@Slf4j
@Aspect
@Component
@RequiredArgsConstructor
public class TeamMapperAdvice {

    private final TeamProcessor teamProcessor;
    private final UserProcessor userProcessor;

    @AfterReturning(value = "execution(* src.main.java.kovteba.mapper.team.TeamMapper.entityToModel(..))",
                    returning = "teamModel")
    public TeamModel addLinksToUserModel(JoinPoint joinPoint, TeamModel teamModel){

        log.debug("Advice for user model with ID: {}", teamModel.getId());

        teamModel.getMembers().forEach(userProcessor::process);

        return teamProcessor.process(teamModel);
    }
}
