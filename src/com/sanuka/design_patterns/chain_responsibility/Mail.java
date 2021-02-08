package com.sanuka.design_patterns.chain_responsibility;

import java.util.HashSet;
import java.util.Set;

public class Mail {
    private final String senderEmail;
    private final int mailAccessLevel;
    private Set<String> receivers = new HashSet<>();
    private String content;
    private String header;

    public Mail(String senderEmail, int mailAccessLevel) {
        this.senderEmail = senderEmail;
        this.mailAccessLevel = mailAccessLevel;
    }

    public Set<String> getReceivers() {
        return receivers;
    }

    public void setReceivers(Set<String> receivers) {
        this.receivers.addAll(receivers);
    }

    public int getMailAccessLevel() {
        return mailAccessLevel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getSenderEmail() {
        return senderEmail;
    }
}
