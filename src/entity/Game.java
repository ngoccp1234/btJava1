package entity;

public class Game {
    private String name;
    private String description;
    private int price;
    private String releaseDate;
    private String homePage;

    @Override
    public String toString() {
        return "----Thông tin game vừa nhập----" +
                "\nTên game: " + name +
                "\nMô tả game: " + description +
                "\nGiá: " + price +
                "\nNgày phát hành: " + releaseDate +
                "\nTrang chủ: " + homePage
                ;
    }

    public Game() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }



    public Game(String name, String description, int price, String releaseDate, String homePage) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.releaseDate = releaseDate;
        this.homePage = homePage;
    }


}
