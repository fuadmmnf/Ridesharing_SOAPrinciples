# Uthao SOA

## Overview
The project implements the principles of standardization, coupling, abstraction and reusability for service oriented architecture. The sample project focuses on a ride sharing platform and demonstrates a very specific fucntional scenario.  It includes the collaboration of services to deal with various stages of ride sharing.

## Setup
Monorepo architecture is used to store multiple service projects (maven) in one github repository. The projects need to be compiled and run separately to expose each service's capabilities.
Running each service:
```
cd project-name
mvn clean compile 
mvn spring-boot:run
```
 
## Service Design Decisions
Among all the services from the design document, five core services were implemented to illustrate service composition. Other services were left out due to the time constraint and, not adding conceptual value to the implentation demonstration. The conceptual process of service production and consumption became saturated at that point. The "Manage Ride Sharing" task service handles the minimal set of operations required to complete the process (violates Separation of Concern to keep implementation simple).  The services used for composition with "Manage Ride Sharing" are - Trip, Customer, Payment, Map.

The patterns followed to implement the services are: 

 - **Data Modeling:** the schema files define base data models not specifying  request or response requrements prioritizing complete reuse. Request and Response specific structures are defined within the service specific wsdl file using the generic schema data models. This is done for two reasons - i) to reduce effort in future modification of request or response structure through combination of reusable models, and ii) the endpoint resolution is erroneous if two operations require the same payload root.
 - **Responsibility Delegation:** endpoints focus on receiving requests and serving responses as per contract definition. The responsibility of managing the data layer is delegated to the repository layer. The repository layer will be responsible to store, update or search data models from any storage. Although these should be separate layer of delegation to handle business logic, to minimize complexity this is done in the endpoint class. For example: retriving the trip before payment initialization
 - **Utility Services:** contained  data schemas for standardized communication to complete transactions of some sort (for example, notification/email sending, writing logs, payments, etc).
 - **Entity Services:** CRUD functionality for entities. The schemas designed were kept decoupled from any specific business scenario. Attributes for entities most intuitively necessary are kept (could be left unused causing no inconvenience). For  example: Trip entity is not associated with any customer/driver/payment as there can be business scenarios not needing them. On the other hand, feedback is kept which will not cause any business specific inconvenience.
 -  **Task Services:** business specific data linking is done here. For instance, in our scenario, we need to map a trip with it's customer, driver and payment information. This type of business specific data linking is done in task service through planned reuse of data models. *Separate data table(s) are required in the task service to store this mapping (response time will be dependent on database synchronization  of the entities involved).*
 - **Contact First Approach:** Data schema and wsdl was designed by hand and complex data types were generated using the jaxb library. These files were copied without any modification to the consumer service, ensuring service usage through contracts.


## Limitations
The design document needed minor modification that were clear after challanges faced during implementation. Deigning before any hands-on experience resulted in designing inconvenient service consumption sequence  logic (for example- GetTripDetail operation was missing which is important to retrieve the entire trip document before updating feedback).  These mistakes helped to adjust few of the more easily noticable gaps which were not incorrect but impractical in terms of implementation. All the proposed services were not implemented and only very limited services were modeled in terms of data and operation (endpoint logic not complete),  Implementation of tasks which are preconditions of the "Manage Ride Sharing" are missing, for example: searching the map to start the trip request, creating customer/driver, etc. Although services are run on manually tuned ports, a proper service discovery mechanism like Netflix Edureka could help easily manage service consumption. 


