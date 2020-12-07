package com.run.baby.run;

import com.run.baby.run.model.User;
import com.run.baby.run.to.UserTo;
import com.run.baby.run.util.UserUtil;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class AuthorizedUser extends org.springframework.security.core.userdetails.User{
    private UserTo userTo;

    public AuthorizedUser(User user) {
        super(user.getEmail(), user.getPassword(), user.isEnabled(), true, true, true, user.getRoles());
        this.userTo = UserUtil.asTo(user);
    }

    public int getId() {
        return userTo.id();
    }

    public void update(UserTo newTo) {
        userTo = newTo;
    }

    public UserTo getUserTo() {
        return userTo;
    }

    @Override
    public String toString() {
        return userTo.toString();
    }
}
}
