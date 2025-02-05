package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.entity.Folder;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {

}
