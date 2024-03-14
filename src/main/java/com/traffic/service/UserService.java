package com.traffic.service;

import com.traffic.entity.UserInfo;
import com.traffic.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public String createFormService(String name,
                                    String info){

        UserInfo userInfo = UserInfo.createUserInfo(name,info);
        userRepository.save(userInfo);

        return "ok";
    }
}
