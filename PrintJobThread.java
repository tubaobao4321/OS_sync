// PrintJobThread - A class to print a file
// 
// PrintJobThread extends Thread, to allow for printing to happen in
// concurrently. This class must request access to a printer, and then
// print the lines from a file.
public class PrintJobThread extends Thread {
	private FileInfo fileToPrint;

	public PrintJobThread(FileInfo file) {
		fileToPrint = file;
	}

        // When start() is called (inherited from Thread) run will
        // execute in a separate thread.
	@Override
	public void run() {
	    // TODO: Implement
	    // 1. Request a printer from Global.printerManager
	    // 2. read file from disk 1 line at a time and write to
	    //    the printer, write a newline to the printer to
	    //    separate print jobs
	    // 3. Release the printer to Global.printerManager
	}
}
