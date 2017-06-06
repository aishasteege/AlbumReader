package asteege;

import javax.json.*;
import static org.junit.Assert.*;

import java.io.StringReader;

import org.junit.Test;

public class AlbumReaderTest {

	@Test
	public void GetTitleReturnsTitleInJsonPhoto() {
		AlbumReader reader = new AlbumReader();
		JsonReader jsonReader = Json.createReader(new StringReader(
				"{\"albumId\":\"1\",\"id\":\"1\",\"title\":\"TEST\"}"));
		JsonObject photo = jsonReader.readObject();
		jsonReader.close();
	    
		String title = reader.getTitle( photo );
		assertEquals("TEST", title);
	}

}
