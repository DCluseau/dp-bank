package app;

import java.util.Scanner;

import model.*;
import service.AccountService;
import service.CustomerService;


public class BankApp {
    public static void menu() {
    	CustomerService customerService = new CustomerService();
    	AccountService accountService = new AccountService();
        try (Scanner sc = new Scanner(System.in)) {
			boolean quitter = false;

			while (!quitter) {
			    System.out.println("\n--- MENU CONSEILLER TP-BANK ---");
			    System.out.println("1. Créer un nouveau compte client");
			    System.out.println("2. Créer un nouveau compte courant");
			    System.out.println("3. Créer un nouveau compte épargne");
			    System.out.println("4. Consulter un compte");
			    System.out.println("5. Effectuer un Dépôt");
			    System.out.println("6. Effectuer un Retrait");
			    System.out.println("7. Effectuer un Virement");
			    System.out.println("8. Voir l'historique (Bonus)");
			    System.out.println("9. Quitter");
			    System.out.print("Choix : ");

			    int choix = sc.nextInt();
			    sc.nextLine(); // Consommer le retour ligne

			    try {
			        switch (choix) {
			        	case 1:
			        		System.out.print("Nom : ");
			        		String lastname = sc.nextLine();
			        		System.out.print("Prénom : ");
			        		String firstname = sc.nextLine();
			        		System.out.print("Email : ");
			        		String email = sc.nextLine();
			        		System.out.print("Numéro de téléphone : ");
			        		String phone = sc.nextLine();
			        		customerService.createCustomer(new CustomerModel(0, lastname, firstname, email, phone));
			            case 5:
			                System.out.print("Numéro (FR-XXXX-XXXX) : ");
			                String num = sc.nextLine();
			                System.out.print("Titulaire : ");
			                String nom = sc.nextLine();
			                System.out.print("Solde initial : ");
			                double solde = sc.nextDouble();
			                System.out.print("Plafond de retrait : ");
			                double plafond = sc.nextDouble();
			                accountService.createCheckAccount(new CheckModel());
			                System.out.println("Succès : Compte créé !");
			                break;

			            case 6:
			                System.out.print("Numéro du compte : ");
			                CompteBancaire c = service.consulterCompte(sc.nextLine());
			                System.out.println("Titulaire: " + c.getTitulaire() + " | Solde: " + c.getSolde() + "€");
			                break;
			                
			            case 7:
			                System.out.print("Numéro du compte : ");
			                String nn = sc.nextLine();
			                System.out.print("Montant du dépôt : ");
			                service.effectuerOperation(nn, "DEPOT", sc.nextDouble());
			                System.out.println("Opération effectuée.");
			                break;

			            case 8:
			                System.out.print("Numéro du compte : ");
			                String n = sc.nextLine();
			                System.out.print("Montant du retrait : ");
			                service.effectuerOperation(n, "RETRAIT", sc.nextDouble());
			                System.out.println("Opération effectuée.");
			                break;

			            case 9:
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