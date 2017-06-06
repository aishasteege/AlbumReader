package asteege;

import javax.json.JsonObject;

public class AlbumReader {

	public String getTitle(JsonObject photo) {
		return photo.getString("title");
	}

	public String getId(JsonObject photo) {
		return "[" + photo.getString("id") + "] ";
	}
}
