package composite;

public class Body implements Component{

    Component title;
    Component text;

    public Body(Post post)
    {
        this.title=new Title(post);
        this.text=new Text(post);
    }

    @Override
    public void refresh() {
        title.refresh();
        text.refresh();
    }

    @Override
    public String render() {
        return "<div>\n" +
                title.render()+"\n"+
                text.render()+"\n"+
                "</div>\n";
    }
}
