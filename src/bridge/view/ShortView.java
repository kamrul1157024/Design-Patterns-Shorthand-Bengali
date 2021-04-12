package bridge.view;

import bridge.resource.IResource;

public class ShortView implements IView{

    private final IResource resource;

    public ShortView(IResource resource) {
        this.resource=resource;
    }


    @Override
    public String showHTML() {
        return "<a href="+resource.getUrl()+">\n<h1>\n"+resource.getTitle()+"\n</h1>\n</a>\n" ;
    }
}
