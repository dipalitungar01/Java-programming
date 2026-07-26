package ch13_Multithreading;
public class  Sphere extends Shape{
     Sphere(int dim1, int dim2){
        super(dim1, dim2);
     }
     public int area(){
        return 4* Math.PI * this.dim1 * this.dim1;
     }
}