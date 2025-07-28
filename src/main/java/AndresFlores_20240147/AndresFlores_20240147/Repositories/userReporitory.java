package AndresFlores_20240147.AndresFlores_20240147.Repositories;

import AndresFlores_20240147.AndresFlores_20240147.Entities.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface userReporitory extends jpaRepository<UserEntity, Long>{
}
