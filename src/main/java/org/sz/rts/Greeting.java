package org.sz.rts;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Greeting {

    private final long id;
    private final String content;
    private final LocalDateTime dateTime;
    private final String ip;

    public Greeting(long id, String content, String ip) {
        this.id = id;
        this.content = content;
        this.ip = ip;
        this.dateTime = LocalDateTime.now();
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getIp() {
        return ip;
    }

    public String getDateTime() {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(dateTime);
    }
}