package net.javaguides.springboot.springsecurity.Entity.Image;


import javax.persistence.*;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "Id"))
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    
    @Column(name = "type", length = 255, nullable =true )
    private String Type;
    
    @Column(name = "imageid", length = 255, nullable =true )
    private String ImageID;
    
    @Column(name = "image1", length = 255, nullable =true )
    private String Image1;
    
    @Column(name = "image2", length = 255, nullable =true )
    private String Image2;
    
    @Column(name = "image3", length = 255, nullable =true )
    private String Image3;
    
    @Column(name = "image4", length = 255, nullable =true )
    private String Image4;
    
    @Column(name = "image5", length = 255, nullable =true )
    private String Image5;
    
    @Column(name = "image6", length = 255, nullable =true )
    private String Image6;
    
    @Column(name = "image7", length = 255, nullable =true )
    private String Image7;

    public Image() {
    }

    public Image(Long id, String type, String imageID, String image1, String image2, String image3, String image4, String image5, String image6, String image7) {
        Id = id;
        Type = type;
        ImageID = imageID;
        Image1 = image1;
        Image2 = image2;
        Image3 = image3;
        Image4 = image4;
        Image5 = image5;
        Image6 = image6;
        Image7 = image7;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getImageID() {
        return ImageID;
    }

    public void setImageID(String imageID) {
        ImageID = imageID;
    }

    public String getImage1() {
        return Image1;
    }

    public void setImage1(String image1) {
        Image1 = image1;
    }

    public String getImage2() {
        return Image2;
    }

    public void setImage2(String image2) {
        Image2 = image2;
    }

    public String getImage3() {
        return Image3;
    }

    public void setImage3(String image3) {
        Image3 = image3;
    }

    public String getImage4() {
        return Image4;
    }

    public void setImage4(String image4) {
        Image4 = image4;
    }

    public String getImage5() {
        return Image5;
    }

    public void setImage5(String image5) {
        Image5 = image5;
    }

    public String getImage6() {
        return Image6;
    }

    public void setImage6(String image6) {
        Image6 = image6;
    }

    public String getImage7() {
        return Image7;
    }

    public void setImage7(String image7) {
        Image7 = image7;
    }
}
