/**
 * 
 */
package dao;

/**
 * 
 */
public interface IDAO<T> {
	public void create(T t);
	public T read();
	public void update(T t);
	public void delete(T t);
}
