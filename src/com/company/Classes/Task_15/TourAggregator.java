package com.company.Classes.Task_15;
import java.util.ArrayList;

public class TourAggregator {
    ArrayList<TourPackage> tourPackages;
    ArrayList<Client> clients;

    public TourAggregator() {
        this.tourPackages = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    public void addClientToAggregator(Client client){
        this.clients.add(client);
    }

    public void addToTourAggregator(TourPackage tourPackage){
        tourPackages.add(tourPackage);
    }

    public void addArrayTourAggregation(ArrayList<TourPackage> tours){
        tourPackages.addAll(tours);
    }

    public void outAllTours(){
        tourPackages.forEach(System.out::println);
    }

    public void outTourByType(String food){
        boolean non = true;
        for(TourPackage tour : tourPackages){
            if (tour.food.toString().compareTo(food) == 0){
                System.out.println(tour);
                non = false;
            }
        }
        if (non) System.out.println("По заданным критериям туров не найдено");
    }

    public void outTourByTransport(String transport){
        boolean non = true;
        for(TourPackage tour : tourPackages){
            if (tour.transport.toString().compareTo(transport) == 0){
                System.out.println(tour);
                non = false;
            }
        }
        if (non) System.out.println("По заданным критериям туров не найдено");
    }

    public void outTourByDays(int minDays, int maxDays){
        boolean non = true;
        for(TourPackage tour : tourPackages){
            if (tour.numberOfDays >= minDays && tour.numberOfDays <= maxDays){
                System.out.println(tour);
                non = false;
            }
        }
        if (non) System.out.println("По заданным критериям туров не найдено");
    }

    public void outByThree(String food, String transport, int minDays, int maxDays){
        boolean non = true;
        for(TourPackage tour : tourPackages){
            if(tour.food.toString().compareTo(food) == 0 &&
                    tour.transport.toString().compareTo(transport) == 0 &&
                    tour.numberOfDays >= minDays &&
                    tour.numberOfDays <= maxDays){
                System.out.println(tour);
                non = false;
            }
        }
        if (non) System.out.println("По заданным критериям туров не найдено");
    }

    public void sortToursByPrice(){
                boolean sort = true;
                while(sort){
                    sort = false;
                    for (int i = 1; i < tourPackages.size(); i++ ){
                        if (tourPackages.get(i-1).getPrice() < tourPackages.get(i).getPrice()){
                            int temp = tourPackages.get(i).getPrice();
                            tourPackages.get(i).setPrice(tourPackages.get(i-1).getPrice());
                            tourPackages.get(i-1).setPrice(temp);
                            sort = true;
                        }
                    }
                }
    }

    public void findTourAndCreateClientAccount(String name, String surname, String city, String typeOfTur){
        for(TourPackage tour : tourPackages){
            if (tour.getCity().compareTo(city) == 0 &&
                    tour.type.toString().compareTo(typeOfTur) == 0){
               clients.add(new Client(name, surname, new TourPackage(tour)));
               System.out.println("Клиент успешно добавлен");
            }
        }
    }

    public void outAllClients(){
        clients.forEach(System.out::println);
    }

    public void outClientBySurname(String surname){
        boolean non = true;
        for(Client client : clients){
            if (client.getSurname().compareTo(surname) == 0){
                System.out.println(client);
                non = false;
            }
        }
        if (non) System.out.println("Клиентов с такой фамилией не найдено");
    }
}
