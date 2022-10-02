package JAVA_ADVANCED.Defining_Classes.Google;

import java.util.List;

public class Person {
    private String name;
    private Company company;
    private Car car;
    private List<Parent> parentList;
    private List<Child> childList;

    private List<Pokemon> pokemonList;

    public Person(String name) {
        this.name = name;
    }

    public void printPerson(Person person) {
        System.out.println(getName());
        if (company == null)
            System.out.println("Company:");
        else System.out.println(company);

        if (car == null)
            System.out.println("Car:");
        else System.out.println(car);

        printList1("Pokemon", getPokemonList());
        printList2("Parents", getParentList());
        printList3("Children", getChildList());

    }

    public void printList1(String name, List<Pokemon> list) {
        System.out.println(name + ":");
        if (list != null) {

            for (var current : list) {
                System.out.println(current);
            }
        }
    }

    public void printList2(String name, List<Parent> list) {
        System.out.println(name + ":");
        if (list != null) {

            for (var current : list) {
                System.out.println(current);
            }
        }
    }

    public void printList3(String name, List<Child> list) {
        System.out.println(name + ":");
        if (list != null) {

            for (var current : list) {
                System.out.println(current);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Parent> getParentList() {
        return parentList;
    }

    public void setParentList(List<Parent> parentList) {
        this.parentList = parentList;
    }

    public List<Child> getChildList() {
        return childList;
    }

    public void setChildList(List<Child> childList) {
        this.childList = childList;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }
}
