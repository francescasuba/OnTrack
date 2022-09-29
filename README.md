# OnTrack - IT4045C(002)
Francesca Suba, Grace Nordwick, Ibukunoluwa Daniel, Lilly Schott, Amber Willis
## Introduction
## Storyboard/Wireframe
## Functional Requirements
### Requirement 1
#### Scenario
As an OnTrack user, I want to utilize a task manager application to track my weekly tasks. 
#### Examples:
- Given:
- When:
- Then:
### Requirement 2
#### Scenario
As an OnTrack user, I want to utilize a task manager application to track my weekly tasks. 
#### Examples:
- Given:
- When:
- Then:
## Class Diagram
![OnTrack Class Diagram](https://github.com/francescasuba/OnTrack/blob/78ccd194ab1f1cda02d203638572429308269c1f/OnTrack%20Class%20Diagram.png)

**com.ontrack:** contains user interface and controller. The UI consists of a few elements such as the main tasks kanban board and an add tasks dialog. The controller includes the index() operation to draw up the starting page of the application.

**com.ontrack.service:** contains the business logic for the application. Includes an interface that contains a couple of operations such as getting a task by name and adding a task. Also includes the service implementation class and a stub to be used as a hardcoded representation of the interface during devlopment.

**com.ontrack.dto:** contains noun class Task with several attributes.

**com.ontack.dao:** contains an interface that handles interactions with a persistence mechanism. Also includes the DAO implementation class and a stub to be used as a hardcoded representation of the interface during devlopment.

## Product Backlog - link here
## Sprint Backlog - link here
## Team Roles
- Product Owner: Francesca Suba
- Business Logic and Persistence: Amber Willis, Grace Nordwick
- UI: Lilly Schott, Ibukunoluwa Daniel
