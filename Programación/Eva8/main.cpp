/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: porcino
 *
 * Created on 22 de septiembre de 2018, 23:35
 */

#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>

using namespace std;

// Headers
string toString (double);
int toInt (string);
double toDouble (string);

int main() {
    cout << "Introduzca la velocidad inicial" << endl;
    double inicial;
    double final;
    double time;
    double acel;
    
    cin >> inicial;
    cout << "Introduzca la velocidad final" << endl;
    cin >> final;
    cout << "Introduzca el tiempo" << endl;
    cin >> time;
    acel = (inicial + final) / 2 * time;
    cout << acel << " metros" << endl;
    return 0;
}
