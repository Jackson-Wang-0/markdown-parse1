import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {
    
    @Test
    public void testfile1() throws IOException {
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        assertEquals("https://something.com",links.get(0));
        assertEquals("some-page.html",links.get(1));

    }
    @Test
    public void testfile2() throws IOException {
        Path fileName = Path.of("test-file2.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        assertEquals("https://something.com",links.get(0));
        assertEquals("some-page.html",links.get(1));

    }
    @Test
    public void testfile3() throws IOException {
        Path fileName = Path.of("test-file3.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        assertEquals(List.of(),links);

    }
   

    @Test
    public void fourthFile() throws IOException{
        Path fileName = Path.of("test-file4.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        assertEquals(List.of(),links);
    }
    @Test
    public void fifthFile() throws IOException{
        Path fileName = Path.of("test-file5.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        assertEquals(List.of(),links);
    }
    @Test
    public void sixthFile() throws IOException{
        Path fileName = Path.of("test-file6.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        assertEquals(List.of(),links);
    }
    @Test
    public void seventhFile() throws IOException{
        Path fileName = Path.of("test-file7.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        assertEquals(List.of(),links);
    }
    @Test
    public void eighthFile() throws IOException{
        Path fileName = Path.of("test-file8.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        assertEquals(List.of(),links);
    }
    
}