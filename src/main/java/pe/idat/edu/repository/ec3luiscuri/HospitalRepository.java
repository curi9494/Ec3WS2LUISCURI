package pe.idat.edu.repository.ec3luiscuri;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.idat.edu.model.ec3luiscuri.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
	
}
