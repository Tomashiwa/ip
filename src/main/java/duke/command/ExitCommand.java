package duke.command;

import duke.exception.DukeCommandException;

public class ExitCommand extends Command {
    @Override
    public void execute() throws DukeCommandException {

    }

    @Override
    public boolean isToExit() {
        return true;
    }
}