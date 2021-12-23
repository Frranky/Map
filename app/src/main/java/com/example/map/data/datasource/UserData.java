package com.example.map.data.datasource;

public class UserData {
    private String name, email;
    private int password;

    public String getName() { return name; }
    public void setName(String name) {

        //Тут будут отправляться измененные данные на сервер
        this.name = name;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) {

        //Тут будут отправляться измененные данные на сервер
        this.email = email;
    }

    public int getPassword() { return password; }
    public void setPassword(int password) {

        this.password = password;
        //Тут будут отправляться измененные данные на сервер
    }

    public UserData() {
        //Тут будет чтение данных с сервера, а пока просто заполнение полей
        name = "Vasya2010";
        password = 136325;
        email = "vasya2010@mail.ru";
    }
}
