package com.spaghetticodejungle;

public class Pasta {
  private final Variety variety;
  private final String type;
  private final String description;
  private final double size;
  private final String translation;
  private final String synonym;
  private final String origin;

  public Pasta(Variety variety, String type, String description, double size,
      String translation, String synonym, String origin) {
    this.variety = variety;
    this.type = type;
    this.description = description;
    this.size = size;
    this.translation = translation;
    this.synonym = synonym;
    this.origin = origin;
  }

  public Variety getVariety() {
    return variety;
  }

  public String getType() {
    return type;
  }

  public String getDescription() {
    return description;
  }

  public double getSize() {
    return size;
  }

  public String getTranslation() {
    return translation;
  }

  public String getSynonym() {
    return synonym;
  }

  public String getOrigin() {
    return origin;
  }

  @Override
  public String toString() {
    return "Pasta{" +
        "variety=" + variety +
        ", type='" + type + '\'' +
        ", description='" + description + '\'' +
        ", size=" + size +
        ", translation='" + translation + '\'' +
        ", synonym='" + synonym + '\'' +
        ", origin='" + origin + '\'' +
        '}';
  }
}
