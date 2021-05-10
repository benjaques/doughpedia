# Cockroach DB

Configuration files to startup a simple 2 node cockroach db cluster for easy local testing.

## Start the Cluster

Run the following commands to start the Cockroach DB cluster:
```shell script
$ docker-compose up
$ docker exec -it roach1 ./cockroach init --insecure
```

To issue sql commands, exec into one of the nodes like so:
```shell script
$ docker exec -it roach1 ./cockroach sql --insecure
# from within container (not necessary as panache will generate tables for us)
$ CREATE DATABASE doughpedia
$ CREATE TABLE doughpedia.episode (
      EpisodeID SMALLINT PRIMARY KEY,
      Name VARCHAR,
      ChainID SMALLINT,
      AverageRating DECIMAL
  );
$ INSERT INTO doughpedia.episode VALUES (1, 'Chili''s with Eva Anderson', 1, 3.33);
```