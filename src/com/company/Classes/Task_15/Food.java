package com.company.Classes.Task_15;

public enum Food {
    NO_INCLUDE,
    ONLY_BREAKFAST,
    ALL_INCLUSIVE;

    @Override
    public String toString() {
        return super.toString().replace('_', ' ').toLowerCase();
    }
}
