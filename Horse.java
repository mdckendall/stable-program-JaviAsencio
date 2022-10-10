// I used "Extends" for the public class so the sub classes have the same properties as the public class. 
public class Horse extends Stable {

  // Information about the horse is abbreviated to make it easier to read.
  String name;
  Double weight;
  Boolean tame;

  public Horse(String name, Double weight, Boolean tame) {

// Prevent any confusion within the code.
this.name = name;
this.weight = weight;
this.tame = tame;
    
  } 
  // Get and return the name of the horse.
public String getName() 
  {
  return name;
}

  // Get and return the weight of the horse.
  public Double getDouble() 
  {
    return weight;
  }

  // Get and return if the horse is or is not tamed.
  public Boolean getTame() 
  {
    return tame;
  }
}