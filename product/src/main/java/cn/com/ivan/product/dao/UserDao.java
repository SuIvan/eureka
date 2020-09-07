package cn.com.ivan.product.dao;


import cn.com.ivan.product.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {


}
