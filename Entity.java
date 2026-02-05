public class Entity {
  String location;
  
  constructor(String _location) {
    location = _location;
  }

  void setLocation(x) {location=x}
  String getLocation() {return location}
  
  abstract void interact(); // Like pressing "e"
  abstract void update();
}
