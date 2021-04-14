package composite;

public class Text implements Component{

    private Post post;
    private String text;

    public Text(Post post)
    {
        this.post=post;
        this.text=post.text;
    }

    @Override
    public void refresh() {
        this.text=post.text;
    }

    @Override
    public String render() {
        return "<pre>"+this.text+"</pre>";
    }
}
