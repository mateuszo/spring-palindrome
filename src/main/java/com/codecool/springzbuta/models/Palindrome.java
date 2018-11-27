package com.codecool.springzbuta.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Palindrome {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String text;

    public Palindrome() {
    }

    public Palindrome(String text) {
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
