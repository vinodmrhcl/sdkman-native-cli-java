package io.sdkman.cli;

import picocli.CommandLine;

public class SDKMAN {

	public static void main(String[] args) {
		new CommandLine(new SDK()).execute(args);
	}

}
