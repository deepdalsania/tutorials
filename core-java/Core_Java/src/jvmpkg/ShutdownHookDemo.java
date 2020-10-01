package jvm;

public class ShutdownHookDemo {

	// shutdownHook is special type of constructor helps to programmer to execute
	// code when JVM will shutdown.
	// like release resource.
	public static void main(String[] args) {

		Runtime.getRuntime().addShutdownHook(new Thread() {

			public void run() {
				Runtime.getRuntime().addShutdownHook(new Thread() {
				});
				Runtime.getRuntime().halt(MAX_PRIORITY); //// halt() for stop hook process
				System.out.println("resource release....");

			}

		});
		System.out.println("working done..");

	}
}
