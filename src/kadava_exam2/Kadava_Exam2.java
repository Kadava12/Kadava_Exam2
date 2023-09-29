/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kadava_exam2;

import java.util.Scanner;

class Item {
    String name;
    

    public Item(String name) {
        this.name = name;
        
    }
}

class Node {
    Item item;
    Node next;

    public Node(Item item) {
        this.item = item;
        this.next = null;
    }
}
        
class ShoppingStore {
    private Node head;
    private Node cart;

    public ShoppingStore() {
        head = null;
        cart = null;
    }

   
    public void addItem(String  Name) {
        Item newItem = new Item(Name);
        Node newNode = new Node(newItem);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

  
    public void displayStore() {
        Node current = head;
        System.out.println("Available Items:");
        while (current != null) {
            System.out.println(current.item.name);
            current = current.next;
        }
    }

  
    public void addToCart(String name) {
        Node current = head;
        while (current != null) {
            if (current.item.name.equalsIgnoreCase(name)) {
                Item newItem = new Item(current.item.name);
                Node newNode = new Node(newItem);
                if (cart == null) {
                    cart = newNode;
                } else {
                    Node cartCurrent = cart;
                    while (cartCurrent.next != null) {
                        cartCurrent = cartCurrent.next;
                    }
                    cartCurrent.next = newNode;
                }
                System.out.println("Added " + name + " to your cart.");
                return;
            }
            current = current.next;
        }
        System.out.println(name + " not found in the store.");
    }

  
    public void displayCart() {
        Node current = cart;
        
        System.out.println("Shopping Cart:");
        while (current != null) {
            System.out.println(current.item.name);
            
            current = current.next;
        }
        
        
    }

   
    public void removeFromCart(String name) {
        Node current = cart;
        Node prev = null;

        while (current != null) {
            if (current.item.name.equalsIgnoreCase(name)) {
                if (prev == null) {
                    cart = current.next;
                } else {
                    prev.next = current.next;
                }
                System.out.println("Removed " + name + " from your cart.");
                return;
            }
            prev = current;
            current = current.next;
        }
        System.out.println(name + " not found in your cart.");
    }
}
public class Kadava_Exam2 {
    public static void main(String[] args) {
     NewClass Accounts = new NewClass();
     ShoppingStore store = new ShoppingStore();
        Scanner scanner = new Scanner(System.in);
        
        store.addItem("====================================");
        store.addItem("Fita");
        store.addItem("Pride Powder");
        store.addItem("Canola oil");
        store.addItem("Nescafe Black Coffee");
        store.addItem("Ariel Powder");
        store.addItem("Resbisco");
        store.addItem("Steelwool");
        store.addItem("Head and Shoulder");
        store.addItem("Nova");
        store.addItem("Tanduay");
        store.addItem("Bearband");
        store.addItem("Nature Spring Mineral 8 oz");
        store.addItem("Coke 1ltr.");
        store.addItem("Sprite Kasalo");
        store.addItem("Royal 1ltr");
        store.addItem("sugar");
        
        
        while (true) {

            System.out.println("=========================================================");
            System.out.println("Options:");
            System.out.println("1. Display available items");
            System.out.println("2. Add item to cart");
            System.out.println("3. Display shopping cart");
            System.out.println("4. Remove item from cart");
            System.out.println("5. Exit");
            System.out.println("=================================");
            System.out.println("1)number question:");
            System.out.println("6.add name:");
            System.out.println("7.display:");
            System.out.println("================================================================");
            System.out.print("Enter your choice: \n");
            System.out.println("================================================================");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    store.displayStore();
                    break;
                case 2:
                    System.out.print("Enter item name to add to cart: ");
                    String itemToAdd = scanner.nextLine();
                    store.addToCart(itemToAdd);
                    break;
                case 3:
                    store.displayCart();
                    break;
                case 4:
                    System.out.print("Enter item name to remove from cart: ");
                    String itemToRemove = scanner.nextLine();
                    store.removeFromCart(itemToRemove);
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
//         void addAccount(int position,String Number) {
//        Nodes newNodes = new Nodes(Number);
//        if (position <0) {
//            System.out.println("empty");
//        }
//        if (position ==0) {
//            
//            newNode.next = head;
//            head=newNode;
//            return;}
//       
//            Node current = head;
//            int currentindex=0;
//            while (current.next != null && currentindex < position -1) {
//                current = current.next;
//                currentindex++;
//            }
//            if(newNode !=null){
//            current.next = newNode;
//            newNode.next = head;
//            }
//            else{
//                System.out.println("invalid");
//            }
//    }
// public  void displayAccounts() {
//    
//        Node current = head;
//
//        while(current.next!=null){
//            System.out.println(current.Number);
//            
//            current = current.next;
//        } System.out.println(current.Number);
    }



