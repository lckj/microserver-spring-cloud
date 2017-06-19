package wang.congjun.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wang.congjun.user.entity.User;

/**
 * Created by wangcongjun on 2017/6/18.
 */
public interface UserRepository extends JpaRepository<User,Integer>{

}
