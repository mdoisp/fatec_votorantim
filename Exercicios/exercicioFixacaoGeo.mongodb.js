const database = 'restaurantesUS';
const collection = 'restaurantes';
const fs = require('fs');
const dadosRestaurantes = fs.readFileSync('GitHub/DSM_Nosql/restaurantes.json')
const jsonRestaurantes = JSON.parse(dadosRestaurantes);

use(database);
db.createCollection(collection);
db.collection.insertMany(jsonRestaurantes)

