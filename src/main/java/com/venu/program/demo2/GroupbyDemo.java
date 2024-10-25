package com.venu.program.demo2;

import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.List;

public class GroupbyDemo {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.print(time);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        TemporalAccessor time1=  dtf.parse("00:30:00");
        System.out.println(time1.toString());

        double num = 00.00;
        System.out.println( "ceil "+Math.ceil(num/2)*2);






    }
}

class Student {
    private String name;
    private int id;
    private String slot;

    public Student(int id, String name, String slot) {
        this.name = name;
        this.id = id;
        this.slot = slot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }
}
