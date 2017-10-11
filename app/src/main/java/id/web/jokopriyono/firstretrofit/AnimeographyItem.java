package id.web.jokopriyono.firstretrofit;

import com.google.gson.annotations.SerializedName;

public class AnimeographyItem{

	@SerializedName("image")
	private String image;

	@SerializedName("name")
	private String name;

	@SerializedName("link")
	private String link;

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

	@Override
 	public String toString(){
		return 
			"AnimeographyItem{" + 
			"image = '" + image + '\'' + 
			",name = '" + name + '\'' + 
			",link = '" + link + '\'' + 
			"}";
		}
}