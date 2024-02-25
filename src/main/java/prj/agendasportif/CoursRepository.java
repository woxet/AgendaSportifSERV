package prj.agendasportif;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "cours", path = "cours")
public interface CoursRepository extends JpaRepository <Cours,Integer>
{
    // Trouver un cours par son nom
    List<Cours> findByName(@Param("name") String name);

    //Trouver un cours par date
    List<Cours> findByDate(@Param("date") String date);

    // Enregistrer un nouveau cours
    Cours save(Cours cours);

    // Trouver un cours par son identifiant
    List<Cours> findById(@Param("id") int id);

    // Récupérer tous les cours
    List<Cours> findAll();

    // Supprimer un cours par son identifiant
    void deleteById(int id);
}