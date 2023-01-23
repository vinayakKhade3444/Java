class Product
{
          int id,price;
          String name;
          void getdata(int i,String n,int p)
          {
                 id=i;
                 name=n;
                 price=p;
                 System.out.println("Details of object");
                 System.out.println("Id= "+id+"\t Name= "+name+"\t Price= "+price);
          }
          void display(int a,int b)
          {
                 int total=a+b;
                 System.out.println("Total price is "+total);
          }
          public static void main(String args[])
          {
                 Product p1=new Product();
                 p1.getdata(10,"Books",100);
                 Product p2=new Product();
                 p2.getdata(15,"Pen",10);
                 p1.display(p1.price,p2.price);
          }
}
