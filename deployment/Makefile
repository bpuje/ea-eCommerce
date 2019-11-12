#====create static ip address (if it created then apply it to k8s env)
gcloud-apply-static-ip:
	gcloud compute addresses create  web-static-ip --region us-central1

gcloud-delete-static-ip:
	gcloud compute addresses delete web-static-ip --region us-central1

gcloud-show-static-ip:
	gcloud compute addresses describe web-static-ip --region us-central1

kubectl-apply-ingress:
	kubectl apply -f basic-ingress.yaml

kubectl-delete-ingress:
	kubectl delete -f basic-ingress.yaml

docker-push-all:
    #cd ../db-service && mvn clean && mvn install
	cd ../auth-service && $(MAKE) docker-push
	cd ../paypal-service && $(MAKE) docker-push
	cd ../credit-service && $(MAKE) docker-push
	cd ../payment-service && $(MAKE) docker-push
	cd ../bank-service && $(MAKE) docker-push
	cd ../orders-service && $(MAKE) docker-push
	cd ../products-service && $(MAKE) docker-push
	cd ../customer-service && $(MAKE) docker-push
	cd ../account-service && $(MAKE) docker-push
	#cd ../db-service && $(MAKE) docker-push

# 	cd ../pays_ba_service && $(MAKE) docker-push
# 	cd ../pays_cc_service && $(MAKE) docker-push
# 	cd ../pays_pp_service && $(MAKE) docker-push
# 	cd ../pays_service && $(MAKE) docker-push
# 	cd ../ship_service && $(MAKE) docker-push
# 	cd ../stock_service && $(MAKE) docker-push

kubectl-apply-all-services:
	kubectl apply -f ../auth-service/deploy/
	kubectl apply -f ../paypal-service/deploy/
	kubectl apply -f ../credit-service/deploy/
	kubectl apply -f ../payment-service/deploy/
	kubectl apply -f ../bank-service/deploy/
	kubectl apply -f ../orders-service/deploy/
	kubectl apply -f ../products-service/deploy/
	kubectl apply -f ../customer-service/deploy/
	kubectl apply -f ../account-service/deploy/
	#kubectl apply -f ../db-service/deploy/

# 	kubectl apply -f ../pays_ba_service/deploy/
# 	kubectl apply -f ../pays_cc_service/deploy/
# 	kubectl apply -f ../pays_pp_service/deploy/
# 	kubectl apply -f ../pays_service/deploy/
# 	kubectl apply -f ../ship_service/deploy/
# 	kubectl apply -f ../stock_service/deploy/


kubectl-delete-all-services:
	kubectl delete -f ../auth-service/deploy/
	kubectl delete -f ../paypal-service/deploy/
	kubectl delete -f ../credit-service/deploy/
	kubectl delete -f ../payment-service/deploy/
	kubectl delete -f ../bank-service/deploy/
	kubectl delete -f ../orders-service/deploy/
	kubectl delete -f ../products-service/deploy/
	kubectl delete -f ../customer-service/deploy/
	kubectl delete -f ../account-service/deploy/
	#kubectl delete -f ../db-service/deploy/

# 	kubectl delete -f ../pays_ba_service/deploy/
# 	kubectl delete -f ../pays_cc_service/deploy/
# 	kubectl delete -f ../pays_pp_service/deploy/
# 	kubectl delete -f ../pays_service/deploy/
# 	kubectl delete -f ../ship_service/deploy/
# 	kubectl delete -f ../stock_service/deploy/

