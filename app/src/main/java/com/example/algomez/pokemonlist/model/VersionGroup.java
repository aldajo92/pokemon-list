package com.example.algomez.pokemonlist.model;

import com.google.gson.annotations.SerializedName;

public class VersionGroup {

  @SerializedName("url") private String url;

  @SerializedName("name") private String name;

  /**
   * @return The url
   */
  public String getUrl() {
    return url;
  }

  /**
   * @param url The url
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * @return The name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name The name
   */
  public void setName(String name) {
    this.name = name;
  }
}