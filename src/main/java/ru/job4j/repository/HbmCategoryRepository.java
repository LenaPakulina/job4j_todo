package ru.job4j.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.job4j.model.Category;
import ru.job4j.repository.utils.CrudRepository;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

@Repository
@AllArgsConstructor
public class HbmCategoryRepository implements CategoryRepository {
    private final CrudRepository crudRepository;

    @Override
    public Collection<Category> findAll() {
        return crudRepository.query("from Category ORDER BY id ASC", Category.class);
    }

    @Override
    public Optional<Category> findById(int id) {
        return crudRepository.optional("from Category WHERE id = :fId", Category.class,
                Map.of("fId", id)
        );
    }

    @Override
    public Collection<Category> getCategoriesByIds(Set<Integer> ids) {
        return crudRepository.query("from Category WHERE id IN :ids ORDER BY id ASC", Category.class,
                Map.of("ids", ids)
        );
    }
}
