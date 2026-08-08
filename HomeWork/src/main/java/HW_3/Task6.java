package HW_3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введіть назву вашої программи (IntelliJ IDEA, Git, Java):");
        String program = scanner.nextLine();
        System.out.println("Введіть вашу ОС (Linux, MacOS, Windows):");
        String OS = scanner.nextLine();
        if (program.equals("IntelliJ IDEA")) {
            if (OS.equals("Windows")) {
                System.out.println("https://www.jetbrains.com/ru-ru/idea/download/download-thanks.html?platform=windows");
            } else if (OS.equals("MacOS")) {
                System.out.println("https://download.jetbrains.com/idea/idea-2026.2.0.1-aarch64.dmg?_gl=1*b1gb78*_gcl_au*ODY4NzY4NjIyLjE3ODM1MzQ0NTcuLS4tLjE3ODYxNzcwOTQuMzE1MjcxNjI5LjE3ODYxNzcwOTUuMTc4NjE3NzYyOQ..*FPAU*ODY4NzY4NjIyLjE3ODM1MzQ0NTc.*_ga*MTAxMjg3Mjg5Ny4xNzgzNTM0NDU3*_ga_9J976DJZ68*czE3ODYxNzcwMDMkbzIkZzEkdDE3ODYxNzc2MjkkajMzJGwwJGgw");
            } else if (OS.equals("Linux")) {
                System.out.println("https://download.jetbrains.com/idea/idea-2026.2.0.1.tar.gz?_gl=1*xs5fl*_gcl_au*ODY4NzY4NjIyLjE3ODM1MzQ0NTcuLS4tLjE3ODYxNzcwOTQuMzE1MjcxNjI5LjE3ODYxNzcwOTUuMTc4NjE3NzcwOQ..*FPAU*ODY4NzY4NjIyLjE3ODM1MzQ0NTc.*_ga*MTAxMjg3Mjg5Ny4xNzgzNTM0NDU3*_ga_9J976DJZ68*czE3ODYxNzcwMDMkbzIkZzEkdDE3ODYxNzc3MDkkajUyJGwwJGgw");
            } else {
                System.out.println("Такої ОС Немає");
            }
        } else if (program.equals("Java")) {
            if (OS.equals("Windows")) {
                System.out.println("https://javadl.oracle.com/webapps/download/AutoDL?BundleId=253458_ba687cb3cbb24342adc8fdf890b993dc");
            } else if (OS.equals("MacOS")) {
                System.out.println("https://javadl.oracle.com/webapps/download/AutoDL?BundleId=253449_ba687cb3cbb24342adc8fdf890b993dc");
            } else if (OS.equals("Linux")) {
                System.out.println("https://javadl.oracle.com/webapps/download/AutoDL?BundleId=253447_ba687cb3cbb24342adc8fdf890b993dc");
            } else {
                System.out.println("Такої ОС Немає");
            }
        } else if (program.equals("Git")) {
            if (OS.equals("Windows")) {
                System.out.println("https://github.com/git-for-windows/git/releases/download/v2.55.0.windows.3/Git-2.55.0.3-64-bit.exe");
            } else if (OS.equals("MacOS")) {
                System.out.println("https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh");
            } else if (OS.equals("Linux")) {
                System.out.println("https://www.kernel.org/pub/software/scm/git/");
            } else {
                System.out.println("Такої ОС Немає"); }
            } else {
                System.out.println("Такої програми не існує");

            }

        }

        }




