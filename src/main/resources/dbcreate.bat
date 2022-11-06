
SET DB2CLP=DB20FADE

runas /noprofile /user:p3admin "db2cmd -c db2 create database DBBD"
runas /noprofile /user:p3admin "db2cmd -c  db2 connect to DBBD"
runas /noprofile /user:p3admin "db2cmd -c -i db2 list database directory"