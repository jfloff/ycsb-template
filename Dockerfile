# Echo Client-Server with Redis writes on the server side.
FROM openjdk:8

MAINTAINER João Loff <jfloff@gsd.inesc-id.pt>

# Install packages
RUN apt-get update && apt-get install -y \
    build-essential \
    maven \
  && rm -rf /var/lib/apt/lists/*

# update default JAVA
RUN update-alternatives --set java $(echo $JAVA_HOME/jre/bin/java)

# Everything after ADD doesn't get cached on docker image
WORKDIR /home/ycsb
COPY . /home/ycsb

# pre-download everything
RUN mvn clean package

# run workload
CMD bin/ycsb load template -P workloads/workloada \
  && bin/ycsb run template -P workloads/workloada
# CMD /bin/bash
