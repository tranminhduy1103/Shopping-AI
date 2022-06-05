package net.javaguides.springboot.springsecurity.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import net.javaguides.springboot.springsecurity.Entity.Image.Image;

public interface ImageService {
	
	public List<Image> getAllImage();
	
	public void saveImage(Image image);
	
	public Image getImageById(long id);
	
	public Image getImageByImageId(String imageId);
	
	public void deleteImageByImageId(String imageId);
	
	public void deleteImageById(long id);

	public void saveImageUpload(MultipartFile imageFile) throws Exception;
}
