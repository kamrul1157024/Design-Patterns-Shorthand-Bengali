package command.commands;

import command.Text;

public class BoldCommand implements  ICommand{

    Text text;

    public BoldCommand(Text text)
    {
        this.text= text;
    }

    @Override
    public void execute() {
        text.updateText("<b>"+text.getText()+"</b>");
    }

    @Override
    public void undo() {
        String currentText= text.getText();
        text.updateText(currentText.substring(3,currentText.length()-4));
    }
}
