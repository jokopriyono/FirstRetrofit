package id.web.jokopriyono.firstretrofit;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("image")
	private String image;

	@SerializedName("member-favorites")
	private int memberFavorites;

	@SerializedName("name")
	private String name;

	@SerializedName("about")
	private String about;

	@SerializedName("mangaography")
	private List<MangaographyItem> mangaography;

	@SerializedName("voice-actors")
	private List<VoiceActorsItem> voiceActors;

	@SerializedName("name-japanese")
	private String nameJapanese;

	@SerializedName("animeography")
	private List<AnimeographyItem> animeography;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setMemberFavorites(int memberFavorites){
		this.memberFavorites = memberFavorites;
	}

	public int getMemberFavorites(){
		return memberFavorites;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAbout(String about){
		this.about = about;
	}

	public String getAbout(){
		return about;
	}

	public void setMangaography(List<MangaographyItem> mangaography){
		this.mangaography = mangaography;
	}

	public List<MangaographyItem> getMangaography(){
		return mangaography;
	}

	public void setVoiceActors(List<VoiceActorsItem> voiceActors){
		this.voiceActors = voiceActors;
	}

	public List<VoiceActorsItem> getVoiceActors(){
		return voiceActors;
	}

	public void setNameJapanese(String nameJapanese){
		this.nameJapanese = nameJapanese;
	}

	public String getNameJapanese(){
		return nameJapanese;
	}

	public void setAnimeography(List<AnimeographyItem> animeography){
		this.animeography = animeography;
	}

	public List<AnimeographyItem> getAnimeography(){
		return animeography;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"image = '" + image + '\'' + 
			",member-favorites = '" + memberFavorites + '\'' + 
			",name = '" + name + '\'' + 
			",about = '" + about + '\'' + 
			",mangaography = '" + mangaography + '\'' + 
			",voice-actors = '" + voiceActors + '\'' + 
			",name-japanese = '" + nameJapanese + '\'' + 
			",animeography = '" + animeography + '\'' + 
			"}";
		}
}