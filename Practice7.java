public class Practice7 {
    public static void main(String[] args) {

        // acutally i normally created the getters and setters but i didnt used any where 
        //i instalized the constructors as the next question in my practice set want to use constructor
        cylinder cy=new cylinder(4, 12);
        cy.display();

        //printing the surface area of cylinder with arguments 
       System.out.println(cy.surfacearea(4, 12));

       //printing the volume of cylinder with arguments
       System.out.println(cy.volume(4, 12));

        
    }
}
class cylinder{
    private float radius;
    private float  height;

    //usage of constructor
    public cylinder(float  radius,float  height){
        this.radius=radius;
        this.height=height;
    }

    //intilizing the getters and setters for radius

    public float  getRadius(){
        return radius;
    }
    public void setRadius(float  radius){
        this.radius=radius;
    }

    //intializing the getters and setters for height
    public float  getHeight(){
        return height;
    }
    public void setHeight(float height){
        this.height=height;
    }

    //to display the given radius and height values of cylinder 
    //here we intilaized the void method which dosent need to give the return statement and parameteres
    public void display(){
        System.out.println("radius of cylinder:"+radius);
        System.out.println("Height of cylinder:"+height);
    }

    // to calculate the surface area of cylinder using radius and height
    //we can give no parameter method but we intialzed the static method
    public static float surfacearea(float radius,float height){
        System.out.println("surface area of cylinder:");
        return   2*3.142f*radius*radius+2*3.142f*radius*height;

    }

    //to calculate the volume of cyclinder uisng radius and height
    //we can give no parameter method but we intialzed the static method
    public static float volume(float radius,float height){
        System.out.println("volume of cylinder:");
        return  3.142f*radius*radius*height;
    }
}
