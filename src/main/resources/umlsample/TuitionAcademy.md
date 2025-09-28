### UML Diagram for Tuition Academy

Actors -
* Student
* Instructor
* Mentor
* TAs

Use Cases -
* Attend Class
* Schedule Mock Interview
* Raise a TA request

### UML Diagram

We will use PlantUML to create the UML diagram. Below is the PlantUML code for a sample scenario from a tuition academy:

```plantuml
@startuml
left to right direction
actor Student
actor Instructor
actor Mentor

rectangle Academy {

    Usecase "Attend Class" as UC1
    Usecase "Attend Class as Host" as UC1a
    Usecase "Attend Class as Audience" as UC1b
    Usecase "Schedule Mock Interview" as UC2
    Usecase "Raise a doubt request" as UC3
    usecase "Check Teaching Assistant availability" as UC4
    
    UC3 .> UC4 : includes
    
    usecase "Check Mentor availability" as UC5
    
    UC2 .> UC5 : includes
    UC1a .> UC1 : extends
    UC1b .> UC1 : extends
    
}

Student --> UC1b
Student --> UC2
Student --> UC3
Mentor --> UC1a
Instructor --> UC1a

@enduml
```