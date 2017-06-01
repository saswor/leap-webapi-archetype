package my.project.core.service;

import my.project.core.entity.User;
import my.project.core.exception.UserNotFoundException;
import leap.core.annotation.Bean;

/**
 * leap示例, 可删除.
 * Created by Leap maven archetype.
 */
@Bean
public class UserService {

    public String getName(String userId) {
        User user = User.findOrNull(userId);
        if(null == user) throw new UserNotFoundException(userId);

        return user.getName();
    }
}
