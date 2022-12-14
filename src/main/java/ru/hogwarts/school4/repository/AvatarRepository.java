package ru.hogwarts.school4.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.hogwarts.school4.model.Avatar;

import java.util.Optional;


@Repository
public interface AvatarRepository extends PagingAndSortingRepository<Avatar, Integer> {
    Optional<Avatar> findByStudentId(Long studentId);

}
