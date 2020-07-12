package org.sz.rts;

import java.time.LocalDateTime;

public class Greeting {

    private Long id;
    private String content;
    private LocalDateTime dateTime;
    private String ip;

    public Greeting() {}

    public Greeting(String content, LocalDateTime dateTime, String ip) {
        this.content = content;
        this.dateTime = dateTime;
        this.ip = ip;
    }

    public Greeting(long id, String content, LocalDateTime dateTime, String ip) {
        this.id = id;
        this.content = content;
        this.dateTime = dateTime;
        this.ip = ip;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}