package com.example.appspinner;

public class ItemData {
    private String textCategoria;
    private String textDescripcion;
    private Integer imageId;

    public ItemData(String textCat, String textDes, Integer imageId){
        this.setTextCategoria(textCat);
        this.setTextDescripcion(textDes);
        this.imageId = imageId;
    }

    public String getTextCategoria() {
        return textCategoria;
    }
    public void setTextCategoria(String textCategoria) {
        this.textCategoria = textCategoria;
    }
    public String getTextDescripcion() {
        return textDescripcion;
    }
    public void setTextDescripcion(String textDescripcion) {
        this.textDescripcion = textDescripcion;
    }
    public Integer getImageId() {
        return imageId;
    }
    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }
}
