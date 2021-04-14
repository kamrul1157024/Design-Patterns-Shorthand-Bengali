package composite;

public class PostComponent implements Component{

    private  Component body;
    private  Component like;

    public PostComponent(Post post)
    {
        this.body=new Body(post);
        this.like=new Like(post);
    }

    @Override
    public void refresh() {
        body.refresh();
        like.refresh();
    }

    @Override
    public String render() {
        return "<div>\n" +
                body.render()+"\n"+
                like.render()+"\n"+
                "</div>\n";
    }
}
