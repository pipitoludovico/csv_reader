import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer
{

    BufferedWriter bw;

    {
        try
        {
            bw = new BufferedWriter(new FileWriter("output.txt"));
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}