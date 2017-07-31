#!/usr/bin/env bash

# something about using gradles distZip to:
./gradlew distZip

tar -xf build/distributions/dropwizard-template.zip -C build/distributions/

./build/distributions/dropwizard-template/bin/dropwizard-template server
