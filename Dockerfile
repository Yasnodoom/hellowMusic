# try some thing

FROM    maven:3.3-jdk-8

RUN apt-get update && apt-get install -y firefox

## Install vnc, xvfb in order to create a 'fake' display and firefox
#RUN     apt-get install -y x11vnc xvfb firefox
#RUN     mkdir ~/.vnc
## Setup a password
#RUN     x11vnc -storepasswd 1234 ~/.vnc/passwd