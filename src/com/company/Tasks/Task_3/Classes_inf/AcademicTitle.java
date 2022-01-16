package com.company.Tasks.Task_3.Classes_inf;

public enum AcademicTitle {
    ASSISTANT("ассистент"),
    ASSISTANT_PROFESSOR("доцент"),
    PROFESSOR("профессор");

    private final String acTitle;

    AcademicTitle(String acTitle) {
        this.acTitle = acTitle;
    }

    public String getAcTitle() {
        return acTitle;
    }
}
