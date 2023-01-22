package com.fluex404.moduleservice;

import com.fluex404.modulemodel.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    private List<User> users = Arrays.asList(
            new User(101, "test 1"),
            new User(102, "test 2"),
            new User(103, "test 3")
    );
    public List<User> getUsers(){
        return users;
    }
}
