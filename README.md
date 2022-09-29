# OnTrack - IT4045C(002)
Francesca Suba, Grace Nordwick, Ibukunoluwa Daniel, Lilly Schott, Amber Willis
## Introduction
Have you ever had an endless list of tasks to finish without any way to organize them? If so, you will be on the right track if you use our application. OnTrack gives you features to easily create, sort, and filter your tasks into a manageable format.
## Storyboard/Wireframe
![OnTrack Wireframe](https://github.com/francescasuba/OnTrack/blob/51d2663064a31c8414e6fd7cecd241bf2d00d953/storyboard.png)
## Functional Requirements
### Requirement 1
#### Scenario
As an OnTrack user, I want to utilize a task manager application to track my weekly tasks. 
#### Examples:
- Given: a list of tasks 
- When: I search for a given task that is there 
- Then: I should receive at least one result for that keyword 

- Given: a list of tasks 
- When: I search for a task that is not there 
- Then: I should receive a message that tells me the task is not found 

- Given: a list of tasks 
- When: I sort by due date 
- Then: the tasks should be sorted in order by due date with the tasks due the soonest at the top 

- Given: a list of tasks 
- When: I filter by completion 
- Then: I should see only tasks that have not been completed 

- Given: a list of tasks 
- When: I click or tap on a task 
- Then: I should be brought to a page that shows me more information about that task 
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
