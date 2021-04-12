package command.commands;

import command.Text;

public class ItalicCommand implements ICommand {

    Text text;

    public ItalicCommand(Text text)
   {
    this.text=text;
   }

    @Override
    public void execute() {
        text.updateText("<i>"+text.getText()+"</i>");
    }

    @Override
    public void undo() {
        String currentText= text.getText();
        text.updateText(currentText.substring(3,currentText.length()-4));
    }
}
