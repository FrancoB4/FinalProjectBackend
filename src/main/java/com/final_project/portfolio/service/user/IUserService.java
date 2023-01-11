package com.final_project.portfolio.service.user;

import com.final_project.portfolio.model.User;
import java.util.List;

public interface IUserService {
    public List<User> getUsers();
    public void saveUser(User user);
    public void deleteUser(Long id);
    public User getUser(Long id);
}
