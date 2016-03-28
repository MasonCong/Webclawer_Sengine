package parsedoc;

import java.util.Collections;
import java.util.Vector;

/**
 * Tuples are basic units to store words
 * word_id is the order of the words first occurrence
 * doc_id is the document passing order
 * position is the occurrence of the word in doc_id
 */


public class Tuple {
	
	public int word_id;
	public int doc_id;
	public int position;
	
	
	
	public Tuple(int word_id, int doc_id, int position) {
		this.word_id = word_id;
		this.doc_id = doc_id;
		this.position = position;
	}

	/**
	 * return word_id of current tuple
	 */
	public int getWord_id() {
		return word_id;
	}
	
	/**
	 * set word_id for current tuple
	 */
	public void setWord_id(int word_id) {
		this.word_id = word_id;
	}
	
	/**
	 * return doc_id of current tuple
	 */
	
	public int getDoc_id() {
		return doc_id;
	}
	
	/**
	 * set doc_id for current tuple
	 */	
	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}
	
	/**
	 * return position in doc_id  
	 */
	
	public int getPosition() {
		return position;
	}
	
	/**
	 * set position for current tuple
	 */
	public void setPosition(int position) {
		this.position = position;
	}

	
	/**
	 * Sort the Tuples by (word_id, doc_id, position)
	 */
	public int compareTo(Tuple t){
		if(this.word_id!=t.word_id){
			if(this.word_id>t.word_id) return 1;
			else return -1;
		}
		else{
			if(this.doc_id!=t.doc_id){
				if(this.doc_id>t.doc_id) return 1;
				else return -1;
			}
			else{
				if(this.position!=t.position){
					if(this.position>t.position) return 1;
					else return -1;
				}
				else return 0;
			}
		}
	}
	
	
	public static void main(String args[]){
		Tuple a=new Tuple(0,3,1);
		Tuple b=new Tuple(0,3,2);
		Tuple c=new Tuple(0,3,0);
		Vector<Tuple> vec=new Vector<Tuple>();
		vec.add(a);
		vec.add(b);
		vec.add(c);
	}
	
}
