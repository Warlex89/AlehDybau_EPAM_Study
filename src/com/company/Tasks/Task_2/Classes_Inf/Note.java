package com.company.Tasks.Task_2.Classes_Inf;

public class Note {

    private static final String GREEN = "\u001B[32m";
    private static final String RESET = "\u001B[0m";
    private final Topic topic;
    private final Date date;
    private final Email email;
    private final Message mess;

    public Note(String topic, String date, String email, String mess) {
        this.topic = new Topic(topic);
        this.date = new Date (date);
        this.email = new Email(email);
        this.mess = new Message(mess);
    }

    public String getTopic() {
        return topic.topic();
    }

    public String getDate() {
        return date.getDay();
    }

    public String getEmail() {
        return email.email();
    }

    public String getMess() {
        return mess.text();
    }

    @Override
    public String toString() {
        return GREEN + "topic = " + RESET + topic + " " +
                GREEN + "date = " + RESET + date.getDay() + " " +
                GREEN + "email = " + RESET + email + " " +
                GREEN + "message = " + RESET + mess;
    }
}
