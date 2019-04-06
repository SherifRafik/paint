package __Memento;

import command.Command;

public class Memento {
    private Command state;

    public Memento(Command command) {
        this.state = command;
    }

    public Command getState() {
        return state;
    }


}
