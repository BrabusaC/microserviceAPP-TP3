Mon projet suit une architecture microservices. Chaque service est indépendant :

Customer-Service : Gère les clients.
Inventory-Service : Gère les produits et le stock.
Billing-Service : Gère les factures en consommant les services ci-dessus.
Gateway-Service : Fournit une API unique pour les utilisateurs.
Eureka Discovery-Service : Permet la découverte et l’enregistrement des services.
<img width="935" alt="eureka" src="https://github.com/user-attachments/assets/f7abb8f9-c341-4b49-9120-6cca38f6e4d7" />
![products](https://github.com/user-attachments/assets/007e2aa3-f17b-4274-8d07-b7e7a251b980)
![billing](https://github.com/user-attachments/assets/9698794b-3880-4630-a53c-e8a230aaef7c)
