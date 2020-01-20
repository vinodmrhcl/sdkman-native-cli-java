package io.sdkman.cli;

import picocli.CommandLine.Command;

@Command(name = "sdk", //
		subcommands = { //
				Echo.class,//
		})
public class SDK implements Runnable {

	public void run() {
	}

}
