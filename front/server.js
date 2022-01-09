const path = require('path')
const express = require("express")
const fs = require('fs');
const mongoose = require('mongoose');

mongoose.connect('mongodb://localhost:27017/IntroMango');

const app = express() // starts a new Express app

const pagesDirectory = `${__dirname}/pages` // equivalent to __dirname + '/pages'

const Player = mongoose.model("Player", {name:String, age:Number})

const player = new Player({name:"Alcide", age:20})
// player.save()

app.use(express.static('public'))
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

//Get tous les whiskys
app.get("/test", (req, res) => {
  res.sendFile(path.resolve('./DataTest/test.json'))
})

//Get one whiskys
app.get("/test/:id", (req, res) => {
  res.sendFile(path.resolve('./DataTest/'+req.params.id+'.json'))
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

app.listen(3000, () => {
  console.log("App listening on port 3000")
})
