package com.example.geektrust;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Game game=new Game();
        game.setGrid(new Grid());
        game.setPower(200);

        try {
            FileInputStream fis = new FileInputStream(args[0]);
            Scanner sc = new Scanner(fis);
            while (sc.hasNextLine()) {
                String input = sc.nextLine();
                String[] cmd = input.split(" ");
                switch (cmd[0]) {
                    case "SOURCE":
                      game.setSource(new Point(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2])));
                        break;
                    case "DESTINATION":
                        game.setDestination(new Point(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2])));
                        break;
                    case "PRINT_POWER":
                        game.getFinalPower();
                        break;
                }
            }
            sc.close();
        } catch (IOException e) {
        }
    }
}
