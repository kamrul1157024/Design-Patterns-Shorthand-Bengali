package command.commands;

import command.Text;

public class UnderlineCommand implements ICommand{

    Text text;
    public UnderlineCommand(Text text)
    {
        this.text=text;
    }

    @Override
    public void execute() {
     text.updateText("<u>"+text.getText()+"</u>");
    }

    @Override
    public void undo() {
        String currentText= text.getText();
        text.updateText(currentText.substring(3,currentText.length()-4));
    }
}
