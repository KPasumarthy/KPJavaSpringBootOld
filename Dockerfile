#docker build -t kpjavaspringboot-image:image.01.2023-tag . ###KP : docker command to build image locally
#docker tag kpjavaspringboot-image:image.01.2023-tag npeegtmregistry.azurecr.io/kpjavaspringboot-image:image.01.2023-tag  ###KP : docker command to rename the image for pushing to ACR
#docker push npeegtmregistry.azurecr.io/kpjavaspringboot-image:image.01.2023-tag
#kubectl get node
#kubectl apply -f pod.yaml
#kubectl get pod -owide
#cat ~/.kube/config
#kubectl apply -f service.yaml
#kubectl apply -f service-nodeport.yaml
#kubectl get svc -owide
#kubectl get ep -owide
FROM openjdk:8-jdk-alpine
MAINTAINER baeldung.com

ADD kpjavaspringboot.war .
CMD java -cp "kpjavaspringboot.war" org.springframework.boot.loader.WarLauncher
