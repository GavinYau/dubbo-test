package com.gavin.dubbo.model.pojo;

import java.io.Serializable;

/**
 * describe:
 *
 * @author Gavin
 * @date 2019/09/22
 */
public class User implements Serializable {
    private String usernmae;
    private int id;

    public String getUsernmae() {
        return usernmae;
    }

    public void setUsernmae(String usernmae) {
        this.usernmae = usernmae;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "usernmae='" + usernmae + '\'' +
                ", id=" + id +
                '}';
    }
}
