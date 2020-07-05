package org.sz.rts;

import java.util.Date;

public class Greeting {

    private final long id;
    private final String content;
    private final Date date;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        this.date = new Date();
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Date getDate() {
        return date;
    }
}