import java.io.*;
public class OldMacDonald {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("Hi");
        ReadFile fileReader = new ReadFile("OldMacDonald.txt");
        String[] poem = fileReader.openFile();
        for (String poem1 : poem) {
            System.out.println(poem1);
        }
    }
}
class ReadFile{
    String path;
    public ReadFile(String file_path){
        path = file_path;
    }
    public String[] openFile() throws IOException{
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);
        int numberOfLines = 9;
        String [] textData = new String[numberOfLines];
        for(int i=0; i<numberOfLines;i++){textData[i]=textReader.readLine();}
	textReader.close();
	return textData;
    }
}

abstract class Animal {
    
}
abstract class Mineral {
    
}
abstract class Vegetable {
    
}
class Farm extends Mineral {
    
}
class Field extends Mineral {
    
}
class Rocks extends Mineral {
    
}
class Human extends Animal {
    
}
class Bovine extends Animal{
    
}
class Avian extends Animal{
    
}
class Tree extends Vegetable {
    
}
class Food extends Vegetable {
    
}
class Farmer extends Human {
    
}
class Cow extends Bovine {
    
}
class Chick extends Avian {
    
}
class Pine extends Tree {
    
}
class Oak extends Tree {
    
}
class Corn extends Food {
    
}
class NorthField extends Field {
    
}
class SouthField extends Field {
    
}
class EastField extends Field {
    
}
class WestField extends Field {
    
}