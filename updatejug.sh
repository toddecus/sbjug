#! /bin/bash
ssh -t jug01 "cd /var/www/sbjug ;sudo git pull ; sudo /sbin/service httpd restart"
ssh -t jug02 "cd /var/www/sbjug ;sudo git pull ; sudo /sbin/service httpd restart"
