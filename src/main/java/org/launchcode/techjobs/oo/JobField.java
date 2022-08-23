package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    private String value;
    private int id;
    private static int nextId = 1;

    public int getId(){
        return id;
    }

    public JobField(){
        id = nextId;
        nextId++;
    }

    public JobField(String value){
        this();
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public String toString() {
        return value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
