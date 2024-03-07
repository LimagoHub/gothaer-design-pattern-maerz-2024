package command;

import java.util.ArrayDeque;
import java.util.Deque;

public class CommandHistory {

    private final Deque<Command> undoStack = new ArrayDeque<>();
    private final Deque<Command> redoStack = new ArrayDeque<>();
    public void add(Command command){
        if(command.isQuery()) return;
        undoStack.push(command);
        redoStack.clear();
    }

    public void undo() {
        if(undoStack.isEmpty())
            System.out.println("cant't undo");
        else {
            final Command command = undoStack.pop();
            command.undo();
            redoStack.push(command);
        }
    }

    public void redo() {
        if(redoStack.isEmpty())
            System.out.println("cant't redo");
        else {
            final Command command = redoStack.pop();
            command.execute();
            undoStack.push(command);
        }
    }
}
