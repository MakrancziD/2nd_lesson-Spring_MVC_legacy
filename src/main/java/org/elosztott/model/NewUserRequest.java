package org.elosztott.model;

/**
 * Created by makra on 2016. 09. 26..
 */

public class NewUserRequest {


    private String username;
    private int credit;
    private User.school vegzettseg;
    private User.color color;
    private User.gender nem;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public User.school getVegzettseg() {
        return vegzettseg;
    }

    public void setVegzettseg(User.school vegzettseg) {
        this.vegzettseg = vegzettseg;
    }

    public User.color getColor() {
        return color;
    }

    public void setColor(User.color color) {
        this.color = color;
    }

    public User.gender getNem() {
        return nem;
    }

    public void setNem(User.gender nem) {
        this.nem = nem;
    }
}
