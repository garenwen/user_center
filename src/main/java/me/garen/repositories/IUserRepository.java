package me.garen.repositories;

import me.garen.models.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by garen on 2017/7/7.
 */
public interface IUserRepository extends CrudRepository<User,Long>{
}
