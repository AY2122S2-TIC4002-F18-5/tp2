package seedu.address.logic.commands;

import javafx.collections.ObservableList;
import seedu.address.commons.core.Messages;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.person.Email;
import seedu.address.model.person.NameContainsKeywordsPredicate;
import seedu.address.model.person.Person;
import seedu.address.ui.EmailWindow;

import static java.util.Objects.requireNonNull;

public class EmailCommand extends Command  {
    public static final String COMMAND_WORD = "email";
    private final NameContainsKeywordsPredicate predicate;
    final String fromEmail = "aaa";
    final String toEmail = "bbb";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Send email to specific"
            + " person in the contact list\n"
            + "Parameters: KEYWORD\n"
            + "Example: " + COMMAND_WORD + " Mic";

    private ObservableList<Person> pLst;

    public EmailCommand(NameContainsKeywordsPredicate predicate) {
        this.predicate = predicate;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        model.updateFilteredPersonList(predicate);

        this.pLst = model.getAddressBook().getPersonList();

        String toEmailAddress = pLst.get(0).getEmail().toString();

        EmailWindow.emailWindow("micheal_yang@getecha.com", toEmailAddress);

        return new CommandResult("Email Sent");
    }
}
