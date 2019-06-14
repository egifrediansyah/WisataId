package id.wisata;

public class Place {

    private String Name;
    private int ImageUrl;
    private String Address;
    private Float Rating;

    public Place() {

    }

    public Place(String name, int imageUrl, String address, Float rating){
        Name = name;
        ImageUrl = imageUrl;
        Address = address;
        Rating = rating;
    }

    public String getName() {
        return Name;
    }

    public int getImageUrl() {
        return ImageUrl;
    }

    public String getAddress() {
        return Address;
    }

    public Float getRating() {
        return Rating;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setImageUrl(int imageUrl) {
        ImageUrl = imageUrl;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setRating(Float rating) {
        Rating = rating;
    }
}
