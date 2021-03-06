package com.innerman.emotracker.service;

import com.innerman.emotracker.model.network.LoginDTO;
import com.innerman.emotracker.model.network.RegistrationDTO;
import com.innerman.emotracker.model.network.UserDTO;
import com.innerman.emotracker.model.network.WebMessage;

/**
 * Created by petrpopov on 08.03.14.
 */
public class UserService extends ApiService<UserDTO> {

    private final static String API_URL = "users";
    private final static String CREATE_USER = "create";
    private final static String LOGIN_USER = "login";
    private final static String TEST_USER = "test";

    public UserService() {
        super(UserDTO.class);
    }


    public WebMessage<UserDTO> signUpUser(RegistrationDTO dto) {

        WebMessage<UserDTO> createUser = this.postForObject(CREATE_USER, dto);

        return createUser;
    }

    public WebMessage<UserDTO> signInUser(LoginDTO dto) {

        WebMessage<UserDTO> loginUser = this.postForObject(LOGIN_USER, dto);

        return loginUser;
    }

    @Override
    protected String getCurrentApiUrl() {
        return API_URL;
    }
}
