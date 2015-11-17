Školní projekt - informační systém pro půjčovnu pracovních strojů.
Tento soubor slouží jako WIKI našeho projektu.

# Adresáře
 * src/main/java/cz/mufi/PA165/RentalConstructionMachinery/
 obsahuje java kódy aplikace
 
 * src/main/resources/
 obsahuje configuraci aplikace
 
 * src/test/java/cz/mufi/PA165/RentalConstructionMachinery/
 obsahuje testovací třídy
 
 * doc/
 obsahuje dokumentaci aplikace (use-case a ERD diagram)

# Popis projektu
 Systém představuje software pro rezervaci pracovních strojů.
 Systém obsahuje čtyři entity.
 * Customer - zákazník naší půjčovny.
 * Machine - stroj k vypůjčení.
 * Revision - revize stroje, slabá entita závislá na Machine.
 * Rent - výpůjčka stroje zákazníkovi, slabá entina závislá na Customer a Machine.
 
# Rozdělení práce
 * 1 entita + dao + test = 1 člen týmu
 * Zdeněk - Customer 
 * Tomáš  - Revision
 * Matěj  - Rent
 * Jakub  - Neúčastní se
 
# HOW TO
 * Maven + Spring + Hibernate + JPA + derby : http://www.adrianwalker.org/2010/08/maven-spring-jpa-skeleton-project.html
 
# MILESTONE 2

- [ ] Implement Facade layer interfaces and implementations.
	- [ ] Everything that should happen in the system must be available through these interfaces (create entities, deleting them etc);
	- [ ] You must have at least 2 non-trivial business functions on Service Layer (the example project contains several of them). Service layer is not always just a  place to delegate to DAO;
- [ ] Other points about the Facade and Service layers:
	- [x] All the classes must be wired via dependency injection. Your service objects should obtain an instance of the EntityManager that way;
	- [x] All the facade interfaces must not reference entities, but Transfer Objects only;
	- [ ] All service interfaces must reference only entities, not Data Transfer Objects;
	- [ ] You can use Dozer framework to map entity instances to transfer objects. The mapping may be done on Facade Layer;
	- [ ] Facade layer is used to drive transactions;
- [x] Change layout of your project to Multimodule Maven project (tutorial here http://maven.apache.org/guides/getting-started/index.html) Your project should have 3 separate modules:
	- [x] DAO layer
	- [ ] Service Layer and Facade Layer implementation
	- [x] API layer - just DTOs and facade interfaces!
- [x] Facade layer will use Service layer and Service layer will use DAO layer;
- [ ] Make sure that DataAccessException or its subclass is thrown in case of any exception on a the DAO layer;
- [ ] Implement simple unit tests for facade layer. Just one simple test per method is enough. This is mainly so that it’s easy to verify the Facade layer works;
- [ ] There must be extensive unit tests for the service layer (particularly for your 2 business functions) and all the tests of service layer must use Mock DAO objects;
