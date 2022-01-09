const path = require('path')
const express = require("express")
const fs = require('fs');
const cors = require('cors');

const app = express() // starts a new Express app

const pagesDirectory = `${__dirname}/pages` // equivalent to __dirname + '/pages'


app.use(express.static('public'))
app.use(cors({origin: '*'}));

// Add headers before the routes are defined
app.use(function (req, res, next) {

  // Website you wish to allow to connect
  res.setHeader('Access-Control-Allow-Origin', 'http://localhost:8080');
  res.setHeader('Access-Control-Allow-Origin', 'http://localhost:8081');

  // Request methods you wish to allow
  res.setHeader('Access-Control-Allow-Methods', 'GET, POST, OPTIONS, PUT, PATCH, DELETE');

  // Request headers you wish to allow
  res.setHeader('Access-Control-Allow-Headers', 'X-Requested-With,content-type');

  // Pass to next layer of middleware
  next();
});

// GET /
app.get("/", (req, res) => {
  res.sendFile(path.resolve(pagesDirectory,'home.html'))
})

// GET /whisky page
app.get("/whisky", (req, res) => {
  res.sendFile(path.resolve(pagesDirectory,'vues/whisky.html'))
})

// GET /whisky page
app.get("/whiskys", (req, res) => {
  res.sendFile(path.resolve('./././DataTest/Whiskys/whiskys.json'))
})

//Get one whiskys
app.get("/whisky/:id", (req, res) => {
  res.sendFile(path.resolve('./././DataTest/Whiskys/whiskys.json'))
})

// GET /whiskyVue
app.get("/whiskyVue", (req, res) => {
  res.sendFile(path.resolve(pagesDirectory,'vues/Whisky/vueWhisky.html'))
})

// GET /whisky page
app.get("/cigare", (req, res) => {
  res.sendFile(path.resolve(pagesDirectory,'vues/cigare.html'))
})

// GET /whisky page
app.get("/cigares", (req, res) => {
  res.sendFile(path.resolve('./././DataTest/Cigares/cigares.json'))
})

//Get one whiskys
app.get("/cigare/:id", (req, res) => {
  res.sendFile(path.resolve('./././DataTest/Cigares/cigares.json'))
})

// GET /whiskyVue
app.get("/cigareVue", (req, res) => {
  res.sendFile(path.resolve(pagesDirectory,'vues/Cigare/vueCigare.html'))
})

// GET /adlsfalsdfjk
app.get("*", (req, res) => {
  res.writeHead(404)
  res.end()
})

app.listen(8081, () => {
  console.log("App listening on port 8081")
})
