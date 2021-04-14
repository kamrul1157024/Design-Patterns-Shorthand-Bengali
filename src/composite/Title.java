package composite;

public class Title implements Component{

    private Post post;
    private String title;

    public Title(Post post)
    {
        this.post=post;
        this.title=this.post.title;
    }

    @Override
    public void refresh() {
        this.title=this.post.title;
    }

    @Override
    public String render() {
        return "<h1>"+title+"</h1>";
    }
}
