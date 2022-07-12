package tote.dao;

public interface CrudDao<ID, T> extends Dao<T> {
    void create(T obj);

    T read(ID id);

    void update(T obj);

    void delete(ID id);
}
