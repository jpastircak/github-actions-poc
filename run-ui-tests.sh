#!/usr/bin/env bash

if [ -z "${SELENIUM_HUB_URL}" ]; then
  SELENIUM_HUB_URL='http://localhost:4444/wd/hub'
fi

echo "Connecting to Selenium Hub on: ${SELENIUM_HUB_URL}"
mvn clean verify -Dwebdriver.driver=remote -Dwebdriver.remote.url=${SELENIUM_HUB_URL}