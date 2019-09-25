package logic;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@XmlRootElement
public class StudentEntity {

  private int id;
  private String name;
  private String address;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public StudentEntity(int id, String name, String address) {
    this.id = id;
    this.name = name;
    this.address = address;
  }

  public StudentEntity() {
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StudentEntity that = (StudentEntity) o;
    return id == that.id &&
        Objects.equals(name, that.name) &&
        Objects.equals(address, that.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address);
  }
}
