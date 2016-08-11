package org.eclipse.kura.example.modbus.register;

public class Command {
	
	private Integer address;
	private String type;
	private String commandName;
	private Integer commandValue;
	
	public Command() { 
		this.address = 0;
		this.type = "";
		this.commandName = "";
		this.commandValue = 0;
	}

	public Integer getAddress() {
		return address;
	}

	public void setAddress(Integer address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getCommandName() {
		return commandName;
	}
	
	public void setCommandName(String commandName) {
		this.commandName = commandName;
	}

	public Integer getCommandValue() {
		return commandValue;
	}

	public void setCommandValue(Integer commandValue) {
		this.commandValue = commandValue;
	}

}