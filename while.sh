#!/bin/sh
echo "How many loops around the Tower this time?"
read MYVAL
COUNTER=0
while [ "$COUNTER" -lt "$MYVAL" ]
do
  COUNTER=`expr "$COUNTER" + 1`
  if [ $COUNTER -ne 1 ]
  then
    echo "Childe Roland $COUNTER times around the Tower came."
  else
    echo "Childe Roland $COUNTER time around the Tower came."
  fi
done
