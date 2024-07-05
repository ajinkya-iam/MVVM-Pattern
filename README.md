# MVVM (Model-View-ViewModel) with Clean Architecture using Kotlin

## MVVM (Model-View-ViewModel) Overview

MVVM is a design pattern that separates the development of the UI from the business logic or back-end logic (the data model). 
This is achieved by introducing a ViewModel layer, which binds the View and the Model together.

### Model: 
The Model represents the data and the business logic of the application. It includes the data source, repository, and business rules.

### View: 
The View represents the UI components and the visual elements of the application. It displays data from the ViewModel and sends user interactions back to the ViewModel.

### ViewModel: 
The ViewModel acts as a bridge between the View and the Model. It holds the UI-related data and handles the logic to manage the data for the View. 
The ViewModel does not have a reference to the View, ensuring a separation of concerns.

## Clean Architecture

Clean arch basically divide into the 3 layers

1. Presentation (UI Layer)
2. Domain (Business Logic Layer)
3. Data Layer (Repository Layer)

### Presentation Layer
In presentation layer, we are going to put everything that your using to display data to the user so activity, fragment, view, view model, 
adapters literally everything that your using to display UI to the user.

### Domain Layer (Business Logic Layer)
In domain layer, we are going to add all logic of application, interfaces and operation to perform when I run the app.
We put it down all the repository. The operation perform in local data base like delete, 
add update all kind of operation added in it.

### Data Layer 
In Data layer, I have put it down all the promise made with data layer. Basically implementation details of those repository 
lIke repository need to the  fetch the session data in data layer we are going to have implemention of that basically we communicate with database, shared preferences and apis.

### Advantages 
1. Easy to understand 
2. Easy to maintain 
3. It very easy to write test case
4. Most imp is when I need to migrate one api to another and make changes in database is only effect to the data layer

## Project File Structure
```
com.ajinkyashinde.mvvmpattern
│
├── data
│   ├── model
│   │   ├── User.kt
│   ├── repository
│   │   ├── UserRepository.kt
│   │   ├── UserRepositoryImpl.kt
│   ├── source
│       ├── remote
│       │   ├── RemoteDataSource.kt
│       ├── local
│           ├── LocalDataSource.kt
│
├── domain
│   ├── model
│   │   ├── 
│   ├── usecase
│       ├── GetUserUseCase.kt
│
├── presentation
│   ├── view
│   │   ├── MainActivity.kt
│   ├── viewmodel
│       ├── UserViewModel.kt
│
├── util
│   ├── Extensions.kt
│   ├── Constants.kt
```
