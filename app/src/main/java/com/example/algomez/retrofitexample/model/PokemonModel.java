package com.example.algomez.retrofitexample.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class PokemonModel {

  @SerializedName("is_battle_only") private Boolean isBattleOnly;

  @SerializedName("sprites") private Sprites sprites;

  @SerializedName("version_group") private VersionGroup versionGroup;

  @SerializedName("form_order") private Integer formOrder;

  @SerializedName("is_mega") private Boolean isMega;

  @SerializedName("form_names") private List<Object> formNames = new ArrayList<Object>();

  @SerializedName("id") private Integer id;

  @SerializedName("is_default") private Boolean isDefault;

  @SerializedName("names") private List<Object> names = new ArrayList<Object>();

  @SerializedName("form_name") private String formName;

  @SerializedName("pokemon") private Pokemon pokemon;

  @SerializedName("order") private Integer order;

  @SerializedName("name")

  private String name;

  /**
   * @return The isBattleOnly
   */
  public Boolean getIsBattleOnly() {
    return isBattleOnly;
  }

  /**
   * @param isBattleOnly The is_battle_only
   */
  public void setIsBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
  }

  /**
   * @return The sprites
   */
  public Sprites getSprites() {
    return sprites;
  }

  /**
   * @param sprites The sprites
   */
  public void setSprites(Sprites sprites) {
    this.sprites = sprites;
  }

  /**
   * @return The versionGroup
   */
  public VersionGroup getVersionGroup() {
    return versionGroup;
  }

  /**
   * @param versionGroup The version_group
   */
  public void setVersionGroup(VersionGroup versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   * @return The formOrder
   */
  public Integer getFormOrder() {
    return formOrder;
  }

  /**
   * @param formOrder The form_order
   */
  public void setFormOrder(Integer formOrder) {
    this.formOrder = formOrder;
  }

  /**
   * @return The isMega
   */
  public Boolean getIsMega() {
    return isMega;
  }

  /**
   * @param isMega The is_mega
   */
  public void setIsMega(Boolean isMega) {
    this.isMega = isMega;
  }

  /**
   * @return The formNames
   */
  public List<Object> getFormNames() {
    return formNames;
  }

  /**
   * @param formNames The form_names
   */
  public void setFormNames(List<Object> formNames) {
    this.formNames = formNames;
  }

  /**
   * @return The id
   */
  public Integer getId() {
    return id;
  }

  /**
   * @param id The id
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * @return The isDefault
   */
  public Boolean getIsDefault() {
    return isDefault;
  }

  /**
   * @param isDefault The is_default
   */
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * @return The names
   */
  public List<Object> getNames() {
    return names;
  }

  /**
   * @param names The names
   */
  public void setNames(List<Object> names) {
    this.names = names;
  }

  /**
   * @return The formName
   */
  public String getFormName() {
    return formName;
  }

  /**
   * @param formName The form_name
   */
  public void setFormName(String formName) {
    this.formName = formName;
  }

  /**
   * @return The pokemon
   */
  public Pokemon getPokemon() {
    return pokemon;
  }

  /**
   * @param pokemon The pokemon
   */
  public void setPokemon(Pokemon pokemon) {
    this.pokemon = pokemon;
  }

  /**
   * @return The order
   */
  public Integer getOrder() {
    return order;
  }

  /**
   * @param order The order
   */
  public void setOrder(Integer order) {
    this.order = order;
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