package models;

import com.google.gson.annotations.SerializedName;
import enums.StudyProfile;

public class University {

  @SerializedName("ID")
  private String id;
  @SerializedName("Полное название")
  private String fullName;
  @SerializedName("Сокращенное название")
  private String shortName;
  @SerializedName("Год основания")
  private int yearOfFoundation;
  @SerializedName("Профиль")
  private StudyProfile mainProfile;

  public University() {
  }


  public String getId() {
    return id;
  }

  public String getFullName() {
    return fullName;
  }

  public String getShortName() {
    return shortName;
  }

  public int getYearOfFoundation() {
    return yearOfFoundation;
  }

  public StudyProfile getMainProfile() {
    return mainProfile;
  }

  public University setId(String id) {
    this.id = id;
    return this;
  }

  public University setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public University setShortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

  public University setYearOfFoundation(int yearOfFoundation) {
    this.yearOfFoundation = yearOfFoundation;
    return this;
  }

  public University setMainProfile(StudyProfile mainProfile) {
    this.mainProfile = mainProfile;
    return this;
  }

  @Override
  public String toString() {
    return "models.University{" +
        "id='" + id + '\'' +
        ", fullName='" + fullName + '\'' +
        ", shortName='" + shortName + '\'' +
        ", yearOfFoundation=" + yearOfFoundation +
        ", mainProfile=" + mainProfile +
        '}';
  }
}
