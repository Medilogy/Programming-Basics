package stringOperation;

import stringOperation.file.TextReader;

import java.util.List;

public class Aplication {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("ok");
        List<String> stringList = TextReader.readFromFile("C:\\Users\\xmedi\\IdeaProjects\\Programing_basis\\tekst.txt");

        //metoda z lambda
        //  stringList.forEach(e -> System.out.println(e));
        //metoda poprawiona lambda?
        //  stringList.forEach(System.out::println);

//        String text = null;
//        for (String s : stringList) {
//            System.out.println("jestem w petli");
//            Thread.sleep(200);
//            text = text +s;
//
//        }
        // z uzyciem string buildera
        StringBuilder bulider = new StringBuilder();
        for (String line : stringList) {
            bulider.append(line).append("\n");
        }
        String text = bulider.toString();

        System.out.println(text);
    }
}
