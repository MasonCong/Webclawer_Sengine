package crawler;
import java.util.Set;

/**
 *Interface Queue
 *
 *Threads can insert Objects at the end of queue and retrieve
 *them from the beginning.
 *
 *This interface supports a level. Read tasks only from level n and
 *write tasks only to level n+1
 *
 *This code is in the public domain.
 */


public interface Queue {
	public Set getGatheredElements();
	public Set getProcessedElements();
	public int getQueueSize(int level);
	public int getProcessedSize();
	public int getGatheredSize();
	public void setMaxElements(int elements);
	public Object pop(int level);
	public boolean push(Object task, int level);
	public void clear();
}
