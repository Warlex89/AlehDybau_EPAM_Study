package com.company.Classes.Task_14;
import java.util.ArrayList;

public class Bank {
    private final String nameBank;
    public ArrayList<Client> clients;

    public Bank(String nameBank, ArrayList<Client> clients) {
        this.nameBank = nameBank;
        this.clients = clients;
    }

    public void addClient(Client newClient){
        clients.add(newClient);
        System.out.println("Добавлен новый клиент");
    }

    public void getClientsAccounts(String clientNames){
        for(Client client : clients){
            if(client.getName().compareTo(clientNames) == 0){
                client.accounts.forEach(System.out::println);
            }
        }
    }

    public void getClientsBank(){
        clients.forEach(System.out::println);
    }

    public void getTotalBalance(String clientName){
        int totalBalance = 0;
        for (Client client : clients){
            if(client.getName().compareTo(clientName) == 0){
            for (Account account : client.accounts){
                totalBalance += account.getBalance();
                }
            }
        }
        System.out.println("Общая сумма по счетам: "+ totalBalance);
    }

    public void getPositiveBalance(String clientName){
        int totalBalance = 0;
        for (Client client : clients){
            if(client.getName().compareTo(clientName) == 0){
                for (Account account : client.accounts){
                    if(account.getBalance() > 0){
                    totalBalance += account.getBalance();
                    }
                }
            }
        }
        System.out.println("Общая сумма по счетам с положительным балансом: "+ totalBalance);
    }

    public void getNegativeBalance(String clientName){
        int totalBalance = 0;
        for (Client client : clients){
            if(client.getName().compareTo(clientName) == 0){
                for (Account account : client.accounts){
                    if(account.getBalance() < 0){
                        totalBalance += account.getBalance();
                    }
                }
            }
        }
        System.out.println("Общая сумма по счетам с отрицательным балансом: "+ totalBalance);
    }

    public void changeAccountStatus(String clientName, int accountID, boolean setStat){
        for(Client client : clients){
            if(client.getName().compareTo(clientName) == 0){
                for(Account account : client.accounts){
                    if (account.getID() == accountID){
                        account.setStatus(setStat);
                    }
                }
            }
        }
    }

    public void changeAccountBalance(String clientName, int accountID, int newBalance){
        for(Client client : clients){
            if(client.getName().compareTo(clientName) == 0){
                for(Account account : client.accounts){
                    if (account.getID() == accountID){
                        account.setBalance(newBalance);
                    }
                }
            }
        }
    }

    public void sortAccountsByBalance(String name){
        for (Client client : clients){
            if(client.getName().compareTo(name) == 0){
              boolean sort = true;
              while(sort){
                  sort = false;
                  for (int i = 1; i < client.accounts.size(); i++ ){
                      if (client.accounts.get(i-1).getBalance() < client.accounts.get(i).getBalance()){
                          int temp = client.accounts.get(i).getBalance();
                          client.accounts.get(i).setBalance(client.accounts.get(i-1).getBalance());
                          client.accounts.get(i-1).setBalance(temp);
                          sort = true;
                      }
                  }
              }
            }
        }
    }
}
