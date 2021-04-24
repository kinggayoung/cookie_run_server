package com.gayoung.cookie_run.cookie;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "cookies")
public class Cookie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "breve")
    private boolean brave;

    @Column(name = "cheerful")
    private boolean cheerful;

    @Column(name = "muscle")
    private boolean muscle;

    @Column(name = "explorer")
    private boolean explorer;

    @Column(name = "pink_chocolate")
    private boolean pink_chocolate;

    public Cookie(boolean brave, boolean cheerful, boolean muscle, boolean explorer, boolean pink_chocolate) {
        this.brave = brave;
        this.cheerful = cheerful;
        this.muscle = muscle;
        this.explorer = explorer;
        this.pink_chocolate = pink_chocolate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isBrave() {
        return brave;
    }

    public void setBrave(boolean brave) {
        this.brave = brave;
    }

    public boolean isCheerful() {
        return cheerful;
    }

    public void setCheerful(boolean cheerful) {
        this.cheerful = cheerful;
    }

    public boolean isMuscle() {
        return muscle;
    }

    public void setMuscle(boolean muscle) {
        this.muscle = muscle;
    }

    public boolean isExplorer() {
        return explorer;
    }

    public void setExplorer(boolean explorer) {
        this.explorer = explorer;
    }

    public boolean isPink_chocolate() {
        return pink_chocolate;
    }

    public void setPink_chocolate(boolean pink_chocolate) {
        this.pink_chocolate = pink_chocolate;
    }
}
