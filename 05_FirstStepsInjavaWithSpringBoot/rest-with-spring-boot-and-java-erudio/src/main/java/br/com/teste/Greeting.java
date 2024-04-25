package br.com.teste;

public class Greeting {

    private final long id;
    private final String content;
    private final String text;
    private final Object[] objects;

    public Greeting(long id, String content, String text, Object[] objects) {
        this.id = id;
        this.content = content;
        this.text = text;
        this.objects = objects;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getText() {
        return text;
    }

    public Object[] getObjects() {
        return objects;
    }
}
