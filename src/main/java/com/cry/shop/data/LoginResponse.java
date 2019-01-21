package com.cry.shop.data;

import java.util.List;
import java.util.Map;

public class LoginResponse {
    private List < Map < String, Object > > users;

    public List < Map < String, Object > > getUsers() {
        return users;
    }

    public void setUsers(List < Map < String, Object > > users) {
        this.users = users;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("LoginResponse [users=");
        builder.append(users);
        builder.append("]");
        return builder.toString();
    }

}
