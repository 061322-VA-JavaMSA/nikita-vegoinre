/**
 * 
 */
package com.revature.oop.daos;

public interface TaskDao extends Serializable, Cloneable {
	
	public abstract Task getTaskById(int id);
	Task addTask(Task newTask)	//implicitly public and abstract
//	boolean boolean deleteTask (int id) -- this has been replaced by "default"
	
	default boolean deleteTask(int id) {
		return true;
		
		
	}
}

/**
 * @author n
 *
 */
public interface TaskDao {

}
