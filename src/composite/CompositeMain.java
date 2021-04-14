package composite;

public class CompositeMain {
    public static void main(String[] args) {
        Post post=new Post(
                "ডিজাইন প্যটার্ন" ,
                "এইখানে আমরা ডিজাইন প্যটার্ন নিয়ে আলোচনা করব",
                12
                );
        Component component=new PostComponent(post);
        System.out.println(component.render());
    }
}
