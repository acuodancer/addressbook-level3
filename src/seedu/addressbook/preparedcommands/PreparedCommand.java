package seedu.addressbook.preparedcommands;

import seedu.addressbook.commands.Command;

public class PreparedCommand {
	
	protected final String arguments;
	
	public PreparedCommand(String args) {
		this.arguments = args;
	}

	public Command prepare() {
		return null;
	}
		
}
