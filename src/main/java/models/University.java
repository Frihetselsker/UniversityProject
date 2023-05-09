package models;

import com.google.gson.annotations.SerializedName;
import enums.StudyProfile;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;


@XmlAccessorType(XmlAccessType.FIELD)
public class University {

  @SerializedName("ID")
  @XmlElement(name = "ID")
  private String id;
  @SerializedName("Полное название")
  @XmlElement(name = "fullName")
  private String fullName;
  @SerializedName("Сокращенное название")
  @XmlElement(name = "shortName")
  private String shortName;
  @SerializedName("Год основания")
  @XmlElement(name = "year")
  private int yearOfFoundation;
  @SerializedName("Профиль")
  @XmlElement(name = "universityProfile")
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
