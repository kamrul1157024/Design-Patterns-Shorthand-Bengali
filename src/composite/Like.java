package composite;

public class Like implements Component{

    private Post post;
    private Integer likes;
    public Like(Post post)
    {
        this.post=post;
        this.likes=post.likes;
    }

    @Override
    public void refresh() {
        this.likes=post.likes;
    }

    @Override
    public String render() {
        return "<p> Likes: "+this.likes+"</p>";
    }
}
