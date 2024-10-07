# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

![UML Diagram for my project](<Copy of UML Diagram.jpg>)

## Description

This project displays a program used for store management, specifically in an electronics store. I named the store "Best Buy", after the famous electronics store. This store sells phones and tablets. I chose this topic because at the same moment while I was brainstorming ideas for this project, my dad asked me what phone he should get, as he is looking to buy a new one. This prompted me to think about this idea for a project, and then I just added tablets as well so that this store would sell both phones and tablets, making it more diverse.

To represent the service of selling electronics in this store, one major thing I used were instance variables. Specifically, I used "name", "price", and "brand" in my superclass "Device", as shown in the UML diagram. I also used the instance variable "operatingSystem" in one of my subclasses "Phone". I also used the instance variable "screenSize" in my other subclass "Tablet". I also made sure to make the access modifiers in the classes private, since all instance variables should be private. I also refactored over and over again, improving the readability of the code. I made sure to use both no-argument constructors and parameterized constructors in the cases that each of them were needed.

There is user input in this project. The user will need to run the program, and will then be prompted with a question asking whether they want to purchase a tablet or phone. After answering this, they will be asked to enter either the phone name or the tablet name based on whichver one they initially picked. Then, the user will put in a price for the device. Then, the user will put in a brand for the device. Then, the user will enter either an operating system or a screen size, depending on if they picked a phone or tablet, respectively. After entering these pieces of information, they will be outputted with a line containing their purchase order.