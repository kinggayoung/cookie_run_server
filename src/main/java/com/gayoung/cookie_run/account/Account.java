package com.gayoung.cookie_run.account;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "user_id")
    private int user_id;

    @Column(name = "level")
    private int level;

    @Column(name = "exp")
    private int exp;

    @Column(name = "money")
    private int money;

    @Column(name = "jelly")
    private int jelly;

    @Column(name = "heart")
    private int heart;

    @Column(name = "time")
    private int time;

    @Column(name = "score")
    private int score;

    public Account(int user_id, int level, int exp, int money, int jelly, int heart, int time, int score) {
        this.user_id = user_id;
        this.level = level;
        this.exp = exp;
        this.money = money;
        this.jelly = jelly;
        this.heart = heart;
        this.time = time;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getJelly() {
        return jelly;
    }

    public void setJelly(int jelly) {
        this.jelly = jelly;
    }

    public int getHeart() {
        return heart;
    }

    public void setHeart(int heart) {
        this.heart = heart;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
