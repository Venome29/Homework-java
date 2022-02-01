//ex7
public class Student {

  protected int id;
  protected String name;
  protected int classyear;
  public Student(int ID,String aName,int cYear){
  id = ID;
  name = aName;
  classyear = cYear;
  }

  public void setId(int Id){
      id=Id;
  }
  public int getID(){
      return id;
  }
  public void setName(String aName){
      name = aName;
  }
  public String getName(){
      return name;
  }
  public void setClassyear(int cYear){
      classyear = cYear;
  }
  public int getClassyear(){
      return classyear;
  }

}