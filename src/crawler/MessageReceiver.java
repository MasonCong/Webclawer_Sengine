package crawler;

public interface MessageReceiver {
	public void receiveMessage(Object theMessage, int threadId);
	public void finished(int threadId);
	public void finishedAll();
}
