package me.garen.services;

import me.garen.models.User;
import me.garen.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by garen on 2017/7/7.
 */
@Service
public class UserServices implements IUserServices {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public long crateUser(User user) {

        userRepository.save(user);
        return user.getUserId();
    }
}
