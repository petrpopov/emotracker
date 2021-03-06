package com.innerman.emotracker.core.security;

import com.innerman.emotracker.core.model.UserEntity;
import com.innerman.emotracker.core.service.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.dao.SaltSource;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

/**
 * User: petrpopov
 * Date: 16.07.13
 * Time: 16:53
 */

@Component
public class EmoSaltSource implements SaltSource {

    @Autowired
    private UserEntityService userService;

    @Override
    public Object getSalt(UserDetails user) {

        String username = user.getUsername();

        UserEntity entity = userService.getUserByUsername(username);
        if(entity == null) {
            return null;
        }

        return entity.getSalt();
    }
}
