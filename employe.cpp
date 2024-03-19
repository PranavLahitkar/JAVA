#include <iostream>
#include <string>

using namespace std;
class Employee {
private:
    string name;
    int age;
    string designation;
    double salary;

public:
    Employee() {
        name = "";
        age = 0;
        designation = "";
        salary = 0.0;
    }
	void inputDetails() {
        cout << "Enter name: ";
        getline(cin, name);
        cout << "Enter age: ";
        cin >> age;
        cin.ignore();
        cout << "Enter designation: ";
        getline(cin, designation);
        cout << "Enter salary: ";
        cin >> salary;
    }
    void displayDetails() {
        cout << "Name: " << name << endl;
        cout << "Age: " << age << endl;
        cout << "Designation: " << designation << endl;
        cout << "Salary: " << salary << endl;
    }
};

int main() { n   
    int numEmployees;

    cout << "Enter the number of employees: ";
    cin >> numEmployees;
    cin.ignore(); 
	Employee* employees = new Employee[numEmployees];
    for (int i = 0; i < numEmployees; ++i) {
        cout << "\nEnter details for employee " << i + 1 << ":\n";
        employees[i].inputDetails();
    }
    cout << "\nEmployee Details:\n";
    for (int i = 0; i < numEmployees; ++i) {
        cout << "\nDetails for employee " << i + 1 << ":\n";
        employees[i].displayDetails();
    }
    delete[] employees;

    return 0;
}

