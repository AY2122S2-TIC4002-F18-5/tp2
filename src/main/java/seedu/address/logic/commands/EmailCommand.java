package seedu.address.logic.commands;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.person.NameContainsKeywordsPredicate;

public class EmailCommand extends Command  {
    public static final String COMMAND_WORD = "email";
    final String fromEmail = "aaa";
    final String toEmail = "bbb";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Send email to specific"
            + " person in the contact list\n"
            + "Parameters: KEYWORD\n"
            + "Example: " + COMMAND_WORD + " Mic";

    public EmailCommand(NameContainsKeywordsPredicate predicate) {

    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        return null;
    }
}
