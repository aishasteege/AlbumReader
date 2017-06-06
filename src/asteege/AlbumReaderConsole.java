package asteege;
import java.net.URL;
import javax.json.*;

public class AlbumReaderConsole
{
	public static void main(String[] args) throws Exception
	{
		AlbumReader albumReader = new AlbumReader();
		try
		{
			URL url = new URL("https://jsonplaceholder.typicode.com/photos?albumId=" + args[0]);

			JsonReader reader = Json.createReader(url.openStream());
			JsonArray array = reader.readArray();

			for (int i = 0; i < array.size(); i++)
			{
				JsonObject photo = array.getJsonObject(i);

				System.out.println(albumReader.getTitle(photo) + albumReader.getTitle(photo));
			}
		}
		catch (IndexOutOfBoundsException e)
		{
			System.err.println("IndexOutOfBoundsException: Please specify album number");
		}
	}
}

