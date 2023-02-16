package com.libraryonline.libraryservice.repository;

import com.libraryonline.libraryservice.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, String> {
}
