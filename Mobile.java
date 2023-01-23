class Mobile
{
        String Company_name;
        int Screen_size;
        void getdata(String n,int s)
       {
                Company_name=n;
                Screen_size=s;
       }
       void display()
       {
                   System.out.println("Details of Mobile");
                   System.out.println("Company Name: "+Company_name+"\tScreen Size: "+Screen_size);
       }
       public static void main(String args[])
       {
                   Mobile m=new Mobile();
                   m.getdata("Tecno",15);
                   m.display();
       }
}
