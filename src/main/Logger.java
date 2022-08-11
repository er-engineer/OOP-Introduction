package main;

public interface Logger {
	// Using interface to get reference of other logger types like MailLogger, ConsoleLogger, etc.
	void log(String message);
}
