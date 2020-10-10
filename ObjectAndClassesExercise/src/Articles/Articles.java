package Articles;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class Articles {

    private String title;
    private String content;
    private String author;

    public Articles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public void setContent(String content) {
        this.content = content;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("%s - %s:%s", this.title, this.content, this.author);

    }
}
