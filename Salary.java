class Salary
{
         public static void main(String args[])
        {
                  int basic=10000;
                  float da,hra,gross;
                  da=(basic*10)/100;
                  hra=(basic*20)/100;
                  gross=basic+da+hra;
                  System.out.println("Gross Salary is "+gross);
        }
}
