package Generics.repository;

public interface Ientity_repository<T extends Ientity> {

    void add(T value);
    void delete(T value);
    void update(T value);

}
