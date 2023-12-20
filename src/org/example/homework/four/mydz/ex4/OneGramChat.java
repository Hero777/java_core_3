package org.example.homework.four.mydz.ex4;

import java.util.Arrays;
import java.util.Scanner;

public class OneGramChat {
    private Message message;
    private User user;
    private User[] users = new User[0];
    private User currentUser;
    Scanner sc = new Scanner(System.in);

    public void userCreate() {
        System.out.println("Создать пользователя.");
        System.out.println("Введите имя: ");
        String name = sc.nextLine();
        System.out.println("Введите пароль: ");
        String password = sc.nextLine();
        user = new User(name, password);
        addUser(user);
        if (user != null) {
            for (User u :
                    users) {
                System.out.println(u.getName());
            }
        } else {
            System.out.println("пусто");
        }
    }

    public void addUser(User user) {
        User[] newUsers = new User[users.length + 1];
        for (int i = 0; i < users.length; i++) {
            newUsers[i] = users[i];
        }
        newUsers[newUsers.length - 1] = user;
        users = newUsers;
    }


    public void userLogin() {
        System.out.println("Войти пользователю.");
        System.out.println("Введите имя: ");
        String name = sc.nextLine();
        System.out.println("Введите пароль: ");
        String password = sc.nextLine();
        currentUser = new User("", "");
        for (User u : users) {
            if (u.getName().equals(name) || u.getPassword().equals(password)) {
                currentUser = u;
                System.out.println("пользователь вошел");
            } else {
                //TODO
                //exception
                System.out.println("такого пользователя нет "
                        + "или пароль введен не правильно");
            }
        }
        System.out.println(currentUser.getName());
    }

    public void userLogout() {
        System.out.println("Выйти пользователю.");
        currentUser = null;

        System.out.println(currentUser);
    }

    public void writeMessage() {
        System.out.println("Написать письмо.");
        System.out.println("Введите имя получателя");
        String receiverName = sc.nextLine();
        System.out.println("Введите текст письма: ");
        String textMessage = sc.nextLine();

        Message message = new Message(textMessage, Type.OUTCOME, receiverName);

        for (User u : users) {
            if (u.getName().equals(receiverName)) {
                u.setMessages(new Message[]{message});
            } else {
                System.out.println("ошибка: такого пользователя нет");
            }
        }
        if (currentUser != null) {
            currentUser.setMessages(new Message[]{new Message(textMessage, Type.INCOME, receiverName)});
        } else {
            System.out.println("ошибка: вы не авторизованы");
        }
    }

    public void readMessage() {
        if (currentUser != null) {
            System.out.println(Arrays.toString(currentUser.getMessages()));
        } else {
            System.out.println("ошибка: вы не авторизованы");
        }
    }

    public void startChat() {
        Scanner scCommand = new Scanner(System.in);
        String command;

        do {
            command = scCommand.nextLine();
            switch (command) {
                case "новый" -> {
                    userCreate();
                }
                case "войти" -> {
                    userLogin();
                }
                case "выйти" -> {
                    userLogout();
                }
                case "написать" -> {
                    writeMessage();
                }
                case "прочитать" -> {
                    readMessage();
                }
                case "exit" -> {
                    break;
                }
                default -> {
                    // TODO: 16. 12. 2023
                    // exception
                    System.out.println("Команда не распознана. Попробуйте снова.");
                }
            }
        } while (!command.equals("exit"));
    }
}
