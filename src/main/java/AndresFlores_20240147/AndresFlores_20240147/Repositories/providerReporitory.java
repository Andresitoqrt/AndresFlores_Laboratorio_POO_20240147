package AndresFlores_20240147.AndresFlores_20240147.Repositories;

import AndresFlores_20240147.AndresFlores_20240147.Entities.providerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface providerReporitory extends JpaRepository<providerEntity, Long> {
}
