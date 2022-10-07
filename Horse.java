// Use "Extend" for the public class so the sub classes have the same properties as the public class.
public class Horse extends Stable {

  // Information about the horse it is abbreviated to make it easier to read.
  String name;
  Double weight;
  Boolean tame;

  public Horse(String name, Double weight, Boolean tame) {

// Prevent any confusion with the code by using the "this" keyword.
this.name = name;
this.weight = weight;
this.tame = tame;

  // I used get to return the name, weight and whether or not the horse is tamed.
 
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

  // Get and return if wheter or not the horse is tamed.
  public Boolean getTame() 
  {
    return tame;
  }
}