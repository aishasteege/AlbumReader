import java.net.URL;
import javax.json.*;

public class AlbumReader
{
	public static void main(String[] args) throws Exception
	{
		try
		{
			URL url = new URL("https://jsonplaceholder.typicode.com/photos?albumId=" + args[0]);

			JsonReader reader = Json.createReader(url.openStream());
			JsonArray array = reader.readArray();

			for (int i = 0; i < array.size(); i++)
			{
				JsonObject photo = array.getJsonObject(i);

				String title = photo.getString("title");
				int id = photo.getInt("id");
				System.out.println("[" + id + "] " + title);
			}
		}
		catch (IndexOutOfBoundsException e)
		{
			System.err.println("IndexOutOfBoundsException: Please specify album number");
		}
	}
}