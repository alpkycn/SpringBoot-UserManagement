# SpringBoot-UserManagement
Dieses Projekt ist eine Spring Boot basierte RESTful-Webanwendung zur Verwaltung von Benutzern, Abteilungen und Mitarbeitern. Es nutzt Spring Security für die Authentifizierung und erstellt beim Login JWT-Tokens (Access- und Refresh-Token).

Die Architektur folgt dem Controller-Service-Repository-Pattern, um eine klare Trennung von Datenzugriff, Geschäftslogik und API-Schicht zu gewährleisten. Die Datenbankanbindung erfolgt über Spring Data JPA und Hibernate.
