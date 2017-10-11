package id.web.jokopriyono.firstretrofit;

import com.google.gson.annotations.SerializedName;

public class VoiceActorsItem{

	@SerializedName("image")
	private String image;

	@SerializedName("name")
	private String name;

	@SerializedName("link")
	private String link;

	@SerializedName("language")
	private String language;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLink(String link){
		this.link = link;
	}

	public String getLink(){
		return link;
	}

	public void setLanguage(String language){
		this.language = language;
	}

	public String getLanguage(){
		return language;
	}

	@Override
 	public String toString(){
		return 
			"VoiceActorsItem{" + 
			"image = '" + image + '\'' + 
			",name = '" + name + '\'' + 
			",link = '" + link + '\'' + 
			",language = '" + language + '\'' + 
			"}";
		}
}