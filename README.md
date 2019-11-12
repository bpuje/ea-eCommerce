# Enterprise Architecture --> Mini Project2 - eCommerce

# Design decisions:
First of all, the project was developed with spring-boot 
and deployed with Google Kubernetes Engine.

We chose Google K8s Engine because 
 - Google Kubernetes Engine (GKE) is a managed, 
 production-ready environment for deploying containerized applications.
    Deploying on Google Cloud manages Spaces for us. Minikube is heavy on local systems.
    
 - Kubernetes Engine enables rapid application development and iteration by making it easy to deploy,
  update, and manage your applications and services.
  
 - Go from a single machine to thousands: Kubernetes Engine autoscaling 
  allows you to handle increased user demand for your services'

# Microservice Interactions: 

#Adding Account - Account Service
url: 
# format:
{
	"firstName": "Chinedu",
	"lastName": "Ugwu",
	"address": "No 1000N 4th Strret",
	"username": "eduurb42@gmail.com",
	"password": "chinedu",
	"defaultPaymentMethod": "credit",
	
	"paymentMethods" : [
			{
				"title":	"credit",
				"csv": "123",
				"creditNumber": "0033 4455 5554 4554",
				"phoneNumber": "000123444"
			},
			{
				"title":	"bank",
				"routingNumber": "1235544",
				"bankNumber": "00334554",
				"phoneNumber": "000123444"
			},
			{
				"title":	"paypal",
				"username": "eduurb42@gmail.com",
				"phoneNumber": "000123444"
			}
		]
}

# authenticating user
Url: 
# format:
{
  "username": "eduurb42@gmail.com",
  "password": "chinedu"
}



