package net.javaguides.springboot.springsecurity.service;

import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import net.javaguides.springboot.springsecurity.Entity.Image.Image;
import net.javaguides.springboot.springsecurity.repository.ImageRepository;

@Service
public class ImageServiceImpl implements ImageService{
	
	@Autowired
	private ImageRepository imageRepository;
	
	@Override
	public List<Image> getAllImage() {
		
		return imageRepository.findAll();
	}

	@Override
	public void saveImage(Image image) {
		this.imageRepository.save(image);
		
	}

	@Override
	public Image getImageById(long id) {
		Optional<Image> optional = imageRepository.findById(id);
		Image image=null;
		if(optional.isPresent()) {
			image=optional.get();
		} else {
			throw new RuntimeException("The Image not found for id:"+id);
		}
		return image;
	}

	@Override
	public Image getImageByImageId(String imageId) {
		Optional<Image> optional = Optional.ofNullable(imageRepository.getImageByImageId(imageId));
		Image image=null;
		if(optional.isPresent()) {
			image=optional.get();
		} else {
			throw new RuntimeException("The Image not found for image Id id:"+imageId);
		}
		return image;
	}

	@Override
	public void deleteImageByImageId(String imageId) {
		this.imageRepository.deleteImageByImageId(imageId);
		
	}

	@Override
	public void deleteImageById(long id) {
		this.imageRepository.deleteById(id);
		
	}

	@Override
	public void saveImageUpload(MultipartFile imageFile) throws Exception {
		String folder ="/laptopImage/";
		byte[] bytes= imageFile.getBytes();
	}

}
