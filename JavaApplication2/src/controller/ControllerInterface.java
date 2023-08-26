/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguye
 * @param <M>
 * @param <D>
 * @param <C>
 */
public interface ControllerInterface<M, D, C> { 
        public void insert(M model);
        public List<M> getAllElement();
        public M getElementById(String id);
        public M getElementByName(String name);
        public void update(M t);
        public void delete(String id);
        public List<M> getElementByCondition(String condition);
}
