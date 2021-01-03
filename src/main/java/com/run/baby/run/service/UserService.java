package com.run.baby.run.service;

import com.run.baby.run.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService extends UserDetailsService {
    public void create(User user);

    public void delete (int id);

    public void update(User user);

    public List<User> getAll();

    public User getByEmail(String email);

    public User get(int id);



}
