DOCKERHUBREPO=puje2docker
IMAGE=${DOCKERHUBREPO}/credit_service

# ===== Maven =====
maven-rebuild:
	mvn clean && mvn install

# ===== Docker =====
docker-build: maven-rebuild
	docker build -t ${IMAGE}:latest .

docker-run:
	docker run -p 8080:8081 ${IMAGE}

docker-login:
	docker login

docker-push: docker-login docker-build
	docker push ${IMAGE}

k8-install:
	kubectl apply -f deploy/

k8-delete:
	kubectl delete -f deploy/

k8-repush-restart: k8-delete docker-push k8-install
