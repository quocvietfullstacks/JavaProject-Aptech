/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nguye
 */
public class User {

        private String _id, name, age, gender, phone, address, userName, password;
        private int rollNum;

        public User(String name, String age, String gender, String phone, String address, String userName, String password, int rollNum) {
                this.name = name;
                this.age = age;
                this.gender = gender;
                this.phone = phone;
                this.address = address;
                this.userName = userName;
                this.password = password;
                this.rollNum = rollNum;
        }

        public User() {
        }

        @Override
        public String toString() {
                return "User{" + "name=" + name + ", age=" + age + ", gender=" + gender + ", phone=" + phone + ", address=" + address + ", userName=" + userName + ", password=" + password + ", rollNum=" + rollNum + '}';
        }

        public String getId() {
                return _id;
        }

        public void setId(String _id) {
                this._id = _id;
        }
        

        public int getRollNum() {
                return rollNum;
        }

        public void setRollNum(int rollNum) {
                this.rollNum = rollNum;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getAge() {
                return age;
        }

        public void setAge(String age) {
                this.age = age;
        }

        public String getGender() {
                return gender;
        }

        public void setGender(String gender) {
                this.gender = gender;
        }

        public String getPhone() {
                return phone;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public String getUserName() {
                return userName;
        }

        public void setUserName(String userName) {
                this.userName = userName;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

}
