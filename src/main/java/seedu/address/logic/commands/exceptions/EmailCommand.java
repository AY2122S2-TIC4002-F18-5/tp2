package seedu.address.logic.commands.exceptions;

import seedu.address.logic.commands.Command;
import seedu.address.logic.commands.CommandResult;
import seedu.address.model.Model;

public class EmailCommand extends Command {
    public static final String COMMAND_WORD = "email";

    @Override
    public CommandResult execute(Model model) throws CommandException {
        return null;
    }
}
