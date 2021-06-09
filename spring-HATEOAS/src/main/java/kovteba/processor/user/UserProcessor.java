package src.main.java.kovteba.processor.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import src.main.java.kovteba.controller.user.UserController;
import src.main.java.kovteba.model.user.UserModel;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@Slf4j
@Component
@RequiredArgsConstructor
public class UserProcessor implements RepresentationModelProcessor<UserModel> {

    @Override
    public UserModel process(UserModel model) {

        model.add(linkTo(methodOn(UserController.class).getUserById(model.getId())).withRel("GET"));
        model.add(linkTo(methodOn(UserController.class).updateUser(model, model.getId())).withRel("PUT"));

        log.debug("User model: {}.", model);

        return model;
    }
}
