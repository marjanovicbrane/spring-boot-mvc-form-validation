# Spring Boot MVC form validation

In this example I used Hibernate Validator to make validation rules and to make our custom validation rule ie. our custom annotation @CourseCode and some other standard validations for all other fields.

When we run our app we have 3 links:Hello world form, Student form and Customer form.

![1](https://user-images.githubusercontent.com/61464267/133888017-6acef640-dda4-46c2-b99f-7b9144ef82df.PNG)

When we open Hello world form, we can enter our name and submit that form.

![2](https://user-images.githubusercontent.com/61464267/133888094-56646bd9-4646-4d91-a275-05168d0f0862.PNG)

When we submit that form in next jsp page, we can show that information which we entered and we can also show some message from the model.

![3](https://user-images.githubusercontent.com/61464267/133888285-7ac437f3-08eb-4b20-81aa-faeb3f712cbb.PNG)

Now we can open another link and anotjer form.We will open now Student form.On the next picture, we can see how that form looks like.

![4](https://user-images.githubusercontent.com/61464267/133888378-0d4e7495-050f-42a6-9fd0-9eed1fd3930e.PNG)

When we submit that form, on the next page we can also see all information that we choose.

![5](https://user-images.githubusercontent.com/61464267/133888448-207990e0-8ef0-452f-b532-fbcb5f4da711.PNG)


We have one more form, Customer form.This form have validation rules, because in this example we used Hibernate Validator.We also made our custom validation rule, ie. custom java annoation.On the next picture we can see how customer form looks like.

Last name field, can't have null value and must have min 1 char.

Free Passes field, validates a number in range 0-10 ie. must be greater than or equal to zero or must be less than or equal to 10.

Postal code field, for this field we was using regular expressions.User can only enter 5 chars/digits for example:78000.

Course Code field, for this field we made our custom validation rule ie. custom java annotation @CourseCode.If we don't enter anything for parameteres of this annotation, it will be DEV value and message:Must start with DEV, by default.In this example we override this values and Course code must starts with with SPACEX.On the next picture we will break this validation to se all error messages.

![6](https://user-images.githubusercontent.com/61464267/133889054-5824d9ce-a64c-4216-b482-d69331423097.PNG)

When we submit our Customer form, on the next page we can also see all information that we entered in this form.

![7](https://user-images.githubusercontent.com/61464267/133889153-1fd4925d-6901-4a60-8120-f9c5f3d0cabe.PNG)

