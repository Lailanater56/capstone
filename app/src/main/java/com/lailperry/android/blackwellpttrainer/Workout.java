package com.lailperry.android.blackwellpttrainer;

import java.util.UUID;

/**
 * Created by Owner on 2/13/2018.
 */

public class Workout {

    String mName;
    String mDescription;
    boolean mComplete;
    UUID id;

    public Workout(String workoutName, String workoutDescription) {
        mName = workoutName;
        mDescription = workoutDescription;
        mComplete = false;
        id = UUID.randomUUID();
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public boolean isComplete() {
        return mComplete;
    }

    public void setComplete(boolean complete) {
        mComplete = complete;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
