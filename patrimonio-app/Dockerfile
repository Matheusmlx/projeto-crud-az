FROM registry.nexus.azi.srv.br/hal/images/base-nginx:latest

ENV APP=patrimonio-intangivel-app.tgz

COPY package.json .

RUN get-npmfile ./package.json $APP && unzip-npmfile ./$APP

