package AQA_HW_2.Task2;


import java.util.List;

public class PetsDto {

    private int id;
    private CategoryDTo category;
    private String name;
    private List<String> photoUrls;
    private List<TagDTo> tags;
    private String status;

    public PetsDto() {}

    public PetsDto(int id, CategoryDTo category, String name, String status) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CategoryDTo getCategory() {
        return category;
    }

    public void setCategory(CategoryDTo category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public List<TagDTo> getTags() {
        return tags;
    }

    public void setTags(List<TagDTo> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
