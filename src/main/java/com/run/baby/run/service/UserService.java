package com.run.baby.run.service;

import com.run.baby.run.AuthorizedUser;
import com.run.baby.run.model.User;
import com.run.baby.run.to.UserTo;

import java.util.List;

public interface UserService {
    public void create(User user);

    public void delete (int id);

    public void update(User user);

    public List<User> getAll();

    public User getByEmail(String email);

    public User get(int id);

    public void update(UserTo userTo);

    public AuthorizedUser loadUserByUsername(String email);

}
