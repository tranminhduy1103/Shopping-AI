package net.javaguides.springboot.springsecurity.upload;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


import net.javaguides.springboot.springsecurity.Exception.FileStorageException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
@Service
public class FileService {
    public String uploadDir;
    public String uploadFile(MultipartFile file) throws FileStorageException {
        uploadDir = "D:/Minh Duy/Green/green-final-project/src/main/resources/static/img";
        String storageFileLink = "/img/" + file.getOriginalFilename();
        try {
            System.out.println(uploadDir);
            Path copyLocation = Paths
                    .get(uploadDir + File.separator + StringUtils.cleanPath(file.getOriginalFilename()));
            Files.copy(file.getInputStream(), copyLocation, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            e.printStackTrace();
            throw new FileStorageException("Could not store file " + file.getOriginalFilename()
                    + ". Please try again!");
        }
        return storageFileLink;
    }
}

