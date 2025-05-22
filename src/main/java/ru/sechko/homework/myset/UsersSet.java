package ru.sechko.homework.myset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UsersSet {
    public static Set<String> onlineUsers = new HashSet<>(Arrays.asList("Alice", "Bob", "Charlie", "Diana"));
    public static Set<String> activeLastWeek =  new HashSet<>(Arrays.asList("Bob", "Diana", "Eve", "Frank"));

    public static Set<String> crossUsers (Set<String> onlineUsers,  Set<String> activeLastWeek) {
        Set<String> crossUsers = new HashSet<>(onlineUsers);
//        for (String onlineUser : onlineUsers) {
//            if (activeLastWeek.contains(onlineUser)) {
//                crossUsers.add(onlineUser);
//            }
//        }
        crossUsers.retainAll(activeLastWeek);
        return crossUsers;
    }


    public static Set<String> noCrossUsers (Set<String> onlineUsers, Set<String> activeLastWeek) {
        Set<String> noCrossUsers = new HashSet<>(onlineUsers);
//        for (String onlineUser : onlineUsers) {
//            if (!activeLastWeek.contains(onlineUser)) {
//                noCrossUsers.add(onlineUser);
//            }
//        }
        noCrossUsers.removeAll(activeLastWeek);
        return noCrossUsers;
    }

    public static Set<String> uniqueUsers(Set<String> onlineUsers, Set<String> activeLastWeek) {
        Set<String> uniqueUsers = new HashSet<>(onlineUsers);
        uniqueUsers.addAll(activeLastWeek);
        return uniqueUsers;
    }

    public static void main(String[] args) {
        System.out.println(crossUsers(onlineUsers, activeLastWeek));
        System.out.println("----------------------------------------");
        System.out.println(noCrossUsers(onlineUsers, activeLastWeek));
        System.out.println("----------------------------------------");
        System.out.println(uniqueUsers(onlineUsers, activeLastWeek));
    }


}
