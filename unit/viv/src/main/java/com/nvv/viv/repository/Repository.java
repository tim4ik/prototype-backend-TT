package com.nvv.viv.repository;

import java.util.List;

public interface Repository<T> {
    void create(T record);
    List<T> read();
    T read(long id);
    void update(T record);
    void delete(long id);
}
