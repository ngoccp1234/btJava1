package main;

import entity.Game;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Nhập thông tin game---\n");
        System.out.println("Tên game: ");
        String name = scanner.nextLine();
        System.out.println("Mô tả game: ");
        String description = scanner.nextLine();
        System.out.println("Giá: ");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ngày phát hành: ");
        String releaseDate = scanner.nextLine();
        System.out.println("Trang chủ: ");
        String homePage = scanner.nextLine();
        System.out.println("------------------");

        Game game = new Game();
        game.setName(name);
        game.setDescription(description);
        game.setPrice(price);
        game.setReleaseDate(releaseDate);
        game.setHomePage(homePage);
        System.out.println(game.toString());



    }



}
