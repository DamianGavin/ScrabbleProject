## ScrabbleProject
We have created database on mongoDb cloud service called Atlas and have tested the connection using the following steps:
* Created Project called ScrabbleGame
* Created cluster called scrabble
* Created database called TestDB
* under TestDB we have created collection TestC and added some data
* We have used mongo shell to connect to our database to retrieve the data

# Run the mongo shell from cmd
* Run cmd and paste in this commands:
mongodb://scrabble-shard-00-00-akmwk.mongodb.net:27017,scrabble-shard-00-01-akmwk.mongodb.net:27017,scrabble-shard-00-02-akmwk.mongodb.net:27017/test?replicaSet=scrabble-shard-0" --ssl --authenticationDatabase admin --username tomduffy89 --password
* Enter password


