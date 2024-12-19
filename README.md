Mon projet suit une architecture microservices. Chaque service est indépendant :

Customer-Service : Gère les clients.
Inventory-Service : Gère les produits et le stock.
Billing-Service : Gère les factures en consommant les services ci-dessus.
Gateway-Service : Fournit une API unique pour les utilisateurs.
Eureka Discovery-Service : Permet la découverte et l’enregistrement des services.
