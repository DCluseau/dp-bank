/**
 * 
 */
package dao;

/**
 * 
 */
public interface IDAO<T> {
	public void create();
	public T read();
	public void update();
	public void delete();
}
