package io.sdkman.cli;

import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "echo")
public class Echo implements Runnable {

	@Parameters(index = "0..*")
	private String[] messages = {};

	public void run() {
		runWithParam(messages);
	}

	public void runWithParam(String... messages) {
		for (String message : messages) {
			System.out.print(message);
		}
	}

}