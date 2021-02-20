package hRJavaAbstractClass;

import java.util.Scanner;

abstract class Book {
  String title;
  abstract void setTitle(String s);
  String getTitle() {
    return title;
  }
}

class MyBook extends Book{
  @Override
  void setTitle(String s) {
    title = s; 
  }
}

public class Main {

  //private static String title;

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    String title = scanner.nextLine();
    System.out.println("Please enter the name of a book");
    
    MyBook newNovel = new MyBook();
    newNovel.setTitle(title);
    System.out.println("The title is " + newNovel.getTitle());
  }
}

