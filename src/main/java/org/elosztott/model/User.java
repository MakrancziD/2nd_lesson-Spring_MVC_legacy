package org.elosztott.model;

/**
 * Created by makra on 2016. 09. 26..
 */

public class User {

    public enum school {ELEMENTARY, HIGH, COLLEGE, UNI};
    public enum color {RED, GREEN, BLUE};
    public enum gender {MALE, FEMALE};

    private String username;
    private int credit;
    private school school;
    private color color;
    private gender gender;

    public User(String _username, int _credit, school _school, color _color, gender _gender) {
        setUsername(_username);
        setCredit(_credit);
        set_school(_school);
        set_color(_color);
        set_gender(_gender);
    }

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

    public school get_school() {
        return school;
    }

    public void set_school(school _school) {
        this.school = _school;
    }

    public color get_color() {
        return color;
    }

    public void set_color(color _color) {
        this.color = _color;
    }

    public gender get_gender() {
        return gender;
    }

    public void set_gender(gender _gender) {
        this.gender = _gender;
    }

}
