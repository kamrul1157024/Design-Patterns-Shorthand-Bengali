package command;

import command.commands.BoldCommand;
import command.commands.ICommand;
import command.commands.ItalicCommand;
import command.commands.UnderlineCommand;

public class CommandMain{

    public static void main(String[] args) {

        Text text=new Text();

        ICommand boldCommand= new BoldCommand(text);
        ICommand italicCommand= new ItalicCommand(text);
        ICommand underlineCommand= new UnderlineCommand(text);

        TextEditor textEditor=new TextEditor(boldCommand,italicCommand,underlineCommand);

        text.updateText("Hello World!");

        textEditor.makeUnderline();
        textEditor.makeBold();
        textEditor.makeBold();
        System.out.println(text.getText());

        textEditor.undo();
        System.out.println(text.getText());

        textEditor.undo();
        System.out.println(text.getText());


    }
}
