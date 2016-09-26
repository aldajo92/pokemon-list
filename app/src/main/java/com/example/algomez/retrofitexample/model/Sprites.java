package com.example.algomez.retrofitexample.model;

import com.google.gson.annotations.SerializedName;

public class Sprites {

@SerializedName("front_default")
private String frontDefault;

@SerializedName("back_default")
private String backDefault;

@SerializedName("front_shiny")
private String frontShiny;

@SerializedName("back_shiny")
private String backShiny;


/**
* 
* @return
* The frontDefault
*/
public String getFrontDefault() {
return frontDefault;
}

/**
* 
* @param frontDefault
* The front_default
*/
public void setFrontDefault(String frontDefault) {
this.frontDefault = frontDefault;
}

/**
* 
* @return
* The backDefault
*/
public String getBackDefault() {
return backDefault;
}

/**
* 
* @param backDefault
* The back_default
*/
public void setBackDefault(String backDefault) {
this.backDefault = backDefault;
}

/**
* 
* @return
* The frontShiny
*/
public String getFrontShiny() {
return frontShiny;
}

/**
* 
* @param frontShiny
* The front_shiny
*/
public void setFrontShiny(String frontShiny) {
this.frontShiny = frontShiny;
}

/**
* 
* @return
* The backShiny
*/
public String getBackShiny() {
return backShiny;
}

/**
* 
* @param backShiny
* The back_shiny
*/
public void setBackShiny(String backShiny) {
this.backShiny = backShiny;
}

}