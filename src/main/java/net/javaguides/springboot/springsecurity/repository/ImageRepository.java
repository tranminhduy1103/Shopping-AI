package net.javaguides.springboot.springsecurity.repository;


import net.javaguides.springboot.springsecurity.Entity.Image.Image;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
	
	@Query(value ="SELECT* FROM image i WHERE i.imageid = ?1", nativeQuery = true)
	public Image getImageByImageId(String imageId);
	
	@Modifying
	@Query(value ="DELETE FROM image i WHERE i.imageid = ?1", nativeQuery = true)
	public void deleteImageByImageId(String imageId);
}
