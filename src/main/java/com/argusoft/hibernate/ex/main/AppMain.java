/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argusoft.hibernate.ex.main;

import com.argusoft.hibernate.ex.model.HelloWorld;
import com.argusoft.hibernate.ex.operations.DbOperations;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author brijesh
 */
public class AppMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;

        while (option != 7) {
            System.out.println("Choose option: ");
            System.out.println("1. Enter an message");
            System.out.println("2. Show an message");
            System.out.println("3. Show all message details");
            System.out.println("4. Update message by ID");
            System.out.println("5. Delete message by ID");
            System.out.println("6. Delete all messages");
            System.out.println("7. Exit");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    createMessage(sc);
                    break;
                case 2:
                    showMessage(sc);
                    break;
                case 3:
                    showMessages();
                    break;
                case 4:
                    updateMessage(sc);
                    break;
                case 5:
                    deleteMessage(sc);
                    break;
                case 6:
                    deleteMessages();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Wrong input!");
                    break;
            }
        }
    }

    private static void createMessage(Scanner sc) {
        System.out.println("Enter a message: ");
        String text = sc.next();
        HelloWorld msg = new HelloWorld(text);
        DbOperations.createRecord(msg);
    }

    private static void showMessage(Scanner sc) {
        System.out.println("Enter message id:  ");
        int id = sc.nextInt();
        HelloWorld helloWorld = DbOperations.findRecordById(id);
        System.out.println(helloWorld);
    }

    private static void showMessages() {
        List<HelloWorld> msgList = DbOperations.displayRecords();
        msgList.forEach((msg) -> {
            System.out.println(msg);
        });
    }

    private static void updateMessage(Scanner sc) {
        System.out.println("Enter message id: ");
        int id = sc.nextInt();
        System.out.println("Enter a message: ");
        String text = sc.next();
        DbOperations.updateRecord(id, text);
    }

    private static void deleteMessage(Scanner sc) {
        System.out.println("Enter message id: ");
        int id = sc.nextInt();
        DbOperations.deleteRecord(id);
    }

    private static void deleteMessages() {
        DbOperations.deleteAllRecords();
    }
}
