package app;

import java.util.ArrayList;
import java.util.Scanner;

import model.*;
import service.AccountService;
import service.CustomerService;


public class BankApp {
	public static void menu() {
		CustomerService customerService = new CustomerService();
		AccountService accountService = new AccountService();

		// Variables for the scanner
		String lastname;
		String firstname;
		String email;
		String phone;
		String accountNumber;
		Double balance;
		Double interestRate;
		int customerId;

		CustomerModel customerTemp = new CustomerModel();
		ArrayList<CustomerModel> listCustomers = new ArrayList<CustomerModel>();

		try (Scanner sc = new Scanner(System.in)) {
			boolean quitter = false;

			while (!quitter) {
				System.out.println("\n--- MENU CONSEILLER TP-BANK ---");
				System.out.println("1. Afficher les clients");
				System.out.println("2. Consulter les comptes d'un client");
				System.out.println("3. Effectuer un Dépôt");
				System.out.println("4. Effectuer un Retrait");
				System.out.println("5. Voir l'historique (Bonus)");
				System.out.println("6. Quitter");
				System.out.print("Choix : ");

				int choix = sc.nextInt();
				sc.nextLine(); // Consommer le retour ligne

				try {
					switch (choix) {
					case 1:
						// Display customers
						listCustomers = customerService.getAllCustomers();
						System.out.println("Identifiant       |Nom          |Prénom          |Email          |Numéro de téléphone|");
						System.out.println("------------------|-------------|----------------|---------------|-------------------|");
						for(CustomerModel c : listCustomers) {
							System.out.println(c);
							System.out.println("------------------|-------------|----------------|---------------|-------------------|");
						}
						break;
					case 2:
						// Display a customer's accounts
						System.out.print("Nom du titulaire : ");
						lastname = sc.nextLine();
						System.out.print("Prénom du titulaire : ");
						firstname = sc.nextLine();
						customerTemp = customerService.getCustomerByNames(lastname, firstname);
						System.out.println("Titulaire: " + customerTemp.getFirstname() + " " + customerTemp.getFirstname() + " | Solde: " + c.getSolde() + "€");
						break;

					case 3:
						// Deposit
						System.out.print("Numéro du compte : ");
						String nn = sc.nextLine();
						System.out.print("Montant du dépôt : ");
						service.effectuerOperation(nn, "DEPOT", sc.nextDouble());
						System.out.println("Opération effectuée.");
						break;

					case 4:
						// Withdrawal
						System.out.print("Numéro du compte : ");
						String n = sc.nextLine();
						System.out.print("Montant du retrait : ");
						service.effectuerOperation(n, "RETRAIT", sc.nextDouble());
						System.out.println("Opération effectuée.");
						break;
					case 5:
						// Display history
					case 6:
						// Quit
						quitter = true;
						System.out.println("Au revoir !!");
						break;
					default:
						System.out.println("Option invalide.");
					}
				} catch (Exception e) {
					System.err.println("ERREUR : " + e.getMessage());
				}
			}
		}
	}
}