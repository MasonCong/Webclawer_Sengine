package crawler;
import java.util.*;

/*
 * Object "data" is supported for carrying additional data over threads.
 * By default, the queue supports 8 levels and an unlimited number of
 * elements.
 */

public class ObjectQueue implements Queue {
		Object data;
		Set gatheredElements;
		Set processedElements;
		LinkedList queues[];
		int mx;
		int nq;
		
		public synchronized void setData(Object o){
			data=o;
		}
		
		public synchronized Object getData(){
			return data;
		}
		
		public ObjectQueue(int _nq, int _mx){
			nq=_nq;
			mx=_mx;
			queues=new LinkedList[nq];
			for(int n=0;n<nq;n++){
				queues[n]=new LinkedList();
			}
		}
		
		public ObjectQueue(){
			nq=8;
			mx=-1;
			queues=new LinkedList[nq];
			for(int n=0;n<nq;n++){
				queues[n]=new LinkedList();
			}
		}
		
		public Set getGatheredElements(){
			return gatheredElements;
		}
		
		public Set getProcessedElements(){
			return processedElements;
		}
		
		public int getQueueSize(int level){
			if(level<0||level>=nq)
				return 0;
			else 
				return queues[level].size();
		}
		
		public int getProcessedSize(){
			return processedElements.size();
		}
		
		public int getGatheredSize(){
			return gatheredElements.size();
		}
		
		public void setMaxElements(int elements){
			mx=elements;
		}
		
		public synchronized Object pop(int level){
			if(level<0 || level >nq)
				return null;
			else if(queues[level].size()==0)
				return null;
			else 
				return queues[level].removeFirst();
		}
		
		public synchronized boolean push(Object task,int level){
			if(mx!=-1&&mx<gatheredElements.size())
				return false;
			if(level<0||level>=nq)
				return false;
			queues[level].addLast(task);
			return true;
		}
		
		public synchronized void clear(){
			for(int n=0; n<nq; n++){
				queues[n].clear();
			}
		}

	
}