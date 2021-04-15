package Main;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Text {

    public void start() {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, whats whats your name?");
        final String userName = scanner.nextLine();
        System.out.println("Oh, nice to meet you " + userName + "\n" +
                "Alright! Lets start \n" +
                "How do you wanna name your Store?");
        final String storeName = scanner.nextLine();
        System.out.println("Wow, you are now the owner of " + storeName + " , but it seems kinda empty... \n" +
                "Here take some cash and buy some flowers");
    }

    public void startShop() {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("                     --The Flower Shop--                                  ");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Hello, welcome to the Flower-Shop.\n" +
                "since you are new here, go ahead and pick a flower");
        System.out.println("Pick one flower by entering the name of it:\n" +
                "In case you wanna know the information of the flower, like how much light\n" +
                "do they need and how much water a day, just enter:\n" +
                "the flower name + ”info” behind it");
        System.out.println("aaa\n" +
                "bbb\n" +
                "ccc");
    }

    public void driving() throws InterruptedException {
        System.out.println(
                " ____|~\\_\n" +
                        "[4x4_|_|-]\n" +
                        " (_)   (_)"
        );
        System.out.println("--------------------------------------------------------------------------");

        TimeUnit.SECONDS.sleep(1);
        System.out.print("\n\n\n\n\n");
        System.out.println(
                "      ____|~\\_\n" +
                        "     [4x4_|_|-]\n" +
                        "      (_)   (_)"
        );
        System.out.println("--------------------------------------------------------------------------");
        System.out.print("\n\n\n\n\n");

        TimeUnit.SECONDS.sleep(1);

        System.out.println(
                "             ____|~\\_\n" +
                        "             [4x4_|_|-]\n" +
                        "             (_)   (_)"
        );
        System.out.println("--------------------------------------------------------------------------");
        System.out.print("\n\n\n\n\n");

        TimeUnit.SECONDS.sleep(1);

        System.out.println(
                "                      ____|~\\_\n" +
                        "                     [4x4_|_|-]\n" +
                        "                     (_)   (_)"
        );
        System.out.println("--------------------------------------------------------------------------");
        System.out.print("\n\n\n\n\n");

        TimeUnit.SECONDS.sleep(1);

        System.out.println(
                "                           ____|~\\_\n" +
                        "                          [4x4_|_|-]\n" +
                        "                          (_)   (_)"
        );
        System.out.println("--------------------------------------------------------------------------");
        System.out.print("\n\n\n\n\n");

        TimeUnit.SECONDS.sleep(1);

        System.out.println(
                "                                     ____|~\\_\n" +
                        "                                    [4x4_|_|-]\n" +
                        "                                    (_)   (_)"
        );
        System.out.println("--------------------------------------------------------------------------");
        System.out.print("\n\n\n\n\n\n\n");
        TimeUnit.SECONDS.sleep(1);

        System.out.println(
                "                                             ____|~\\_\n" +
                        "                                            [4x4_|_|-]\n" +
                        "                                            (_)   (_)"
        );
        System.out.println("--------------------------------------------------------------------------");
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n");

        TimeUnit.SECONDS.sleep(5);
    }

    public void flowerImg() {
        System.out.println(
                "     /\\^/`\\\n" +
                        "    | \\/   |\n" +
                        "    | |    |\n" +
                        "    \\ \\    /\n" +
                        "     '\\\\//'\n" +
                        "   |\\  ||  |\\\n" +
                        "    \\ \\||/ /\n" +
                        "     `\\\\//`\n" +
                        "    ^^^^^^^^");
    }
}