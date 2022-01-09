const path = require('path')
const express = require("express")
const fs = require('fs');
const mongoose = require('mongoose');
const cors = require('cors');

mongoose.connect('mongodb://localhost:27017/IntroMango');

const app = express() // starts a new Express app

const pagesDirectory = `${__dirname}/pages` // equivalent to __dirname + '/pages'

const Player = mongoose.model("Player", {name:String, age:Number})

const player = new Player({name:"Alcide", age:20})
// player.save()

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

// GET /rhums
app.get("/cigares", (req, res) => {
  res.sendFile(path.resolve(pagesDirectory,'cigares.html'))
})

// GET /whisky page
app.get("/whisky", (req, res) => {
  res.sendFile(path.resolve(pagesDirectory,'vues/whisky.html'))
})

//Get one whiskys
app.get("/test/:id", (req, res) => {
  res.sendFile(path.resolve('./DataTest/Whiskys/'+req.params.id+'.json'))
})

// GET /whiskyVue
app.get("/whiskyVue", (req, res) => {
  res.sendFile(path.resolve(pagesDirectory,'vues/Whisky/vueWhisky.html'))
})

// GET /adlsfalsdfjk
app.get("*", (req, res) => {
  res.writeHead(404)
  res.end()
})

app.listen(8081, () => {
  console.log("App listening on port 8081")
})
