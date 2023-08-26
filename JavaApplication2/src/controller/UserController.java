/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.UserDAO;
import java.util.ArrayList;
import java.util.List;
import model.User;

/**
 *
 * @author nguye
 */
public class UserController implements ControllerInterface<User, UserDAO, UserController> {

        User user;
        UserDAO userDao;
        UserController userController;

        public UserController() {
                userDao = new UserDAO();
        }

        @Override
        public void insert(User user) {
                userDao.insert(user);
        }

        @Override
        public void delete(String id) {
                userDao.delete(id);
        }

        @Override
        public List<User> getAllElement() {
                return userDao.getAllElement();
        }

        @Override
        public User getElementById(String id) {
                return userDao.getElementById(id);
        }

        @Override
        public void update(User user) {
                userDao.update(user);
        }

        @Override
        public User getElementByName(String userName) {
                return userDao.getElementByUserName(userName);
        }
        
        @Override
        public List<User> getElementByCondition(String condition) {
                return userDao.getElementByCondition(condition);
        }
        public List<User> getElementByConditionPhone(String condition) {
                return  userDao.getElementByConditionPhone(condition);
        }

}
