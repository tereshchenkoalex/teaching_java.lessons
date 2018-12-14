package io.github.tereshchenkoalex.heading_java.lesson6;//**DFD CodeMagnets (MultiFor), p. 119

public class MultiFor_MyEdit {
    public static void main(String[] args){
        for (int x = 0; x < 4; x++){
            for (int y = 4; y > 2; y--){
                if (x == 2){
                    x++;
                }
                System.out.println(x + " " + y);
            }
        }
    }
}
