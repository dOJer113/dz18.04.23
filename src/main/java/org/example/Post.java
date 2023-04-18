package org.example;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {
    private String id;
    private String text;
    private String type;
    private String user;
    private int upvotes;
    public Post(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") int upvotes){
        this.id = id;
        this.type = type;
        this.user = user;
        this.text = text;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }
    @Override
    public String toString() {
            return "Cat" +
                    "\n id = " + id +
                    "\n text = " + text +
                    "\n user = " + user +
                    "\n type = " + type +
                    "\n upvotes = " + upvotes;
    }
}
