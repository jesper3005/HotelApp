package hotel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class flieReader implements Serializable{
     Controller con;
    
    
    public void getPresy() throws FileNotFoundException, IOException {
       try(FileOutputStream f = new FileOutputStream("file.txt");
            ObjectOutput s = new ObjectOutputStream(f)) {
            s.writeObject(con.presidentialRoom1);            
            }
    }
}
