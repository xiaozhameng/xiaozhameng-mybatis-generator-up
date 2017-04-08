package com.xiaozhameng.dao;

import com.xiaozhameng.entity.User;

public interface UserDAO {
    int delete(Integer id);

    int insert(User record);

    int update(User record);

    User select(Integer id);
}