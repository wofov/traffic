package com.traffic.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_info_id")
    private long id;

    private String userName;
    private String info;



    public static UserInfo createUserInfo(String userName,
                                          String info){

        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(userName);
        userInfo.setInfo(info);
        return userInfo;
    }
}
