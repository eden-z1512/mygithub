class CCircle   {
  double pi;    
  double radius;
  double getArea(){
    return radius*radius*pi;
}
  void setCircle(double r, double p){     
      pi=p;
      radius=r;   
   }
}
public class TestCCircleArea{
   public static void main(String args[])   {
      CCircle cir1=new CCircle();   
      cir1.setCircle(2.0,3.1416);
      System.out.println("area="+cir1.getArea()); 
   }
}
