///create a class rectangle  void area and void perimeter
class Rectangle
{
    int length=10;
    int breadth=20;
    int area=0;
    int perimeter=0;
    void setval(int length, int perimeter);
 
void disp()
{
       System.out.println("length of Rectangle:"+length);
       System.out.println("bredth of Rectangle:"+breadth);
}
int area()
{
      area=length*breadth;
       return area;
}
int perimeter()
{
      perimeter=2*(length+breadth);
      return perimeter;
}
public static void main(String args[]){
 Rectangle obj=new Rectangle();
  obj.setval(10,20);
  int area= obj.area();
  System.out.println("area is:"+area);
  int perimeter=obj.perimeter();
  System.out.println("perimeter is:"=perimeter);
 
	}
}
