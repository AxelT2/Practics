#include <iostream>

using namespace std;

int ant;

 void sec1()
{
if(ant==1)

cout << "Enero";

}

 void sec2()
{
if(ant==2)

cout << "Febrero";

}

 void sec3()
{
if(ant==3)

cout << "Marzo";

}
 void sec4()
{
if(ant==4)

cout << "Abril";

}

 void sec5()
{
if(ant==5)

cout << "Mayo";

}

 void sec6()
{
if(ant==6)

cout << "Junio";

}
 void sec7()
{
if(ant==7)

cout << "Julio";

}

 void sec8()
{
if(ant==8)

cout << "Agosto";

}

 void sec9()
{
if(ant==9)

cout << "Septiembre";

}

 void sec10()
{
if(ant==10)

cout << "Octubre";

}

 void sec11()
{
if(ant==11)

cout << "Noviembre";

}

 void sec12()
{
if(ant==12)

cout << "Diciembre";

}

void sec13()
{
if(ant>12)

cout << "Vuelva a correr?";

}
int main()
{

    cout << " Ingrese un numero del 1 al 12" << endl;
    cin >> ant;

    sec1();
    sec2();
    sec3();
    sec4();
    sec5();
    sec6();
    sec7();
    sec8();
    sec9();
    sec10();
    sec11();
    sec12();
    sec13();

    return 0;
}
