const express = require('express')
const app = express()
const swaggerUi = require('swagger-ui-express');
const swaggerFile = require('./swagger-output.json');
const bodyParser = require('body-parser');
const homeRoute = require('./src/routes/homeRoute')
const adminRoute = require('./src/routes/adminRoute')

app.use(bodyParser.urlencoded({ extended: false }));
app.use(homeRoute)
app.use(adminRoute)

app.use(bodyParser.json());
app.use('/docs', swaggerUi.serve, swaggerUi.setup(swaggerFile));

app.set('view engine', 'ejs')
app.set('views', './src/views/')

app.listen(3000, function(){
    console.log('App rodando na porta 3000')
})