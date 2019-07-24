package com.example.demo.mapper;


import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author AlmostLover
 */
@Mapper
@Repository
public interface UserMapper {
    /**
     * 查询所有用户
     * @return
     */
    List<User> queryUserList();

    /**
     * 按照id查询用户
     * @param id
     * @return
     */
    User queryById(Integer id);
    /**
     * 添加用户
     * @param user
     */
    void add(User user);
    /**
     * 删除用户
     * @param id
     */
    void delete(Integer id);
    /**
     * 修改用户
     * @param user
     */
    void update(User user);
}
