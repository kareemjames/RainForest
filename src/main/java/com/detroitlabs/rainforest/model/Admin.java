package com.detroitlabs.rainforest.model;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User {

    private List<User> admins = new ArrayList<>();

    public void addAdmin() {
        admins.add(new User("kj", "pass"));
        admins.add(new User("dp", "pass"));
        admins.add(new User("mc", "pass"));
    }
}
