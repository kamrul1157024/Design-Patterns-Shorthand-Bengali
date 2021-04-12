package command;

import command.commands.ICommand;

import java.util.Stack;

public class TextEditor {

    private final ICommand bold;
    private final ICommand italic;
    private final ICommand underline;

    private Stack<ICommand> commands;

    public TextEditor(ICommand bold,ICommand italic,ICommand underline)
    {
        this.bold=bold;
        this.italic=italic;
        this.underline=underline;
        commands= new Stack<>();
    }

    public void makeBold()
    {
        bold.execute();
        commands.push(bold);
    }

    public void makeItalic()
    {
        italic.execute();
        commands.push(italic);
    }

    public void  makeUnderline()
    {
        underline.execute();
        commands.push(underline);
    }

    public void undo()
    {
        commands.pop().undo();
    }
}
